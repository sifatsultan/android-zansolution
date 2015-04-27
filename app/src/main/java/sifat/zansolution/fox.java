package sifat.zansolution;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class fox extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fox);
        Button next = (Button)findViewById(R.id.enter);
    }

    public void next(View view){
        Intent intent = new Intent(fox.this, shark.class);
        startActivity(intent);
    }


}
