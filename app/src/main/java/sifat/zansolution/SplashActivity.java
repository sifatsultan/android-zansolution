package sifat.zansolution;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SplashActivity extends Activity {
    static String APP_NAME = "Zan Solution";
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Button next = (Button) findViewById(R.id.next);
    }

    public void next(View view){
        Intent intent = new Intent(this,ServicesActivity.class);
        startActivity(intent);
    }

}
