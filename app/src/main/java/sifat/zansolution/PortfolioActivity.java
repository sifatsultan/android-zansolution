package sifat.zansolution;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by Sifat on 1/5/2016.
 */
public class PortfolioActivity extends ListActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ListView listView = (ListView)findViewById(R.id.listView);
        TheAdapter mAdapter = new TheAdapter(context);
        listView.setAdapter(mAdapter);


        super.onCreate(savedInstanceState);
    }
}
