package sifat.zansolution;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class NumberActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        Button next = (Button)findViewById(R.id.next);
    }



    public void next(View view){
        Intent intent = new Intent(this, LuckyActivity.class);
        startActivity(intent);
    }
}
