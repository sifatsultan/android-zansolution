package sifat.zansolution;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class lucky extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky);
        Button next = (Button)findViewById(R.id.next);
    }

    public void next(View view){
        Intent intent = new Intent(this, fox.class);
        startActivity(intent);
    }

}
