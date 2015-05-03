package sifat.zansolution;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class services extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

//        graphic_design, seo, socialmarketing,motion_graphics
//        graphic_design, seo, social_marketing, motion_graphics


        Button graphicDesign = (Button)findViewById(R.id.graphicDesign);
        Button seo = (Button)findViewById(R.id.seo);
        Button socialMarketing = (Button)findViewById(R.id.socialMarketing);
        Button motionGraphics = (Button)findViewById(R.id.motionGraphics);
    }


    public void graphic_design(View view){
        Intent intent = new Intent(this, fox.class);
        startActivity(intent);
    }

    public void seo(View view){
        Intent intent = new Intent(this,shark.class);
        startActivity(intent);
    }

    public void social_marketing(View view){
        Intent intent = new Intent(this, number.class);
        startActivity(intent);
    }

    public void motion_graphics(View view){
        Intent intent = new Intent(this, lucky.class);
        startActivity(intent);
    }


}
