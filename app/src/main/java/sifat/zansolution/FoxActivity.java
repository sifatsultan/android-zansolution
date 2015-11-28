package sifat.zansolution;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class FoxActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fox);
        Button next = (Button)findViewById(R.id.enter);
    }

    public void next(View view){
        Intent intent = new Intent(FoxActivity.this, SharkActivity.class);
        startActivity(intent);
    }


}
