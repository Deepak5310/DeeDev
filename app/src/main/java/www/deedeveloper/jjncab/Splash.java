package www.deedeveloper.jjncab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread splash=new Thread() {
            public void run() {

                try{

// set sleep time
                    sleep(3*500);
                    Intent i =new Intent (getBaseContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                }catch (Exception ignored){

                }
            }

        };
        splash.start();
    }
}