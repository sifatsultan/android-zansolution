package sifat.zansolution;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;


public class SplashActivity extends Activity {
    static String APP_NAME = "Zan Solution";
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // TODO: Your application init goes here.
                Intent intent = new Intent(SplashActivity.this, StoryActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        }, 3000);

        Button next = (Button) findViewById(R.id.next);
    }

    public void next(View view){
        Intent intent = new Intent(this,StoryFreshActivity.class);
        startActivity(intent);
    }

}
