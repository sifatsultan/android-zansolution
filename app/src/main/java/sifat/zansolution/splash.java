package sifat.zansolution;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Button next = (Button)findViewById(R.id.next);
    }

    public void next(View view){
        Intent intent = new Intent(this,services.class);
        startActivity(intent);
    }


}
