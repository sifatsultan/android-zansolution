package sifat.zansolution;

import android.app.ListActivity;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SimpleCursorAdapter;


public class MainActivity extends ListActivity implements LoaderManager.LoaderCallbacks<Cursor>{

    SimpleCursorAdapter simpleCursorAdapter;

    //Connecting to the database..
    static final String[] PROJECTION  = new String[] {ContactsContract.Data._ID, ContactsContract.Data.DISPLAY_NAME};

    //which data to select..
    //here we want every data which has a name in it...
    static final String SELECTION = "(("
            + ContactsContract.Data.DISPLAY_NAME
            +" NOTNULL ) AND ("
            + ContactsContract.Data.DISPLAY_NAME
            +" != ''))";

    static final String[] PROJECTION_SERVICES = new String[] {"Fox","Shark","Lucky","Number"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //progress bar for loading
        ProgressBar progressBar = new ProgressBar(this);
        progressBar.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        progressBar.setIndeterminate(true);
        getListView().setEmptyView(progressBar);

        //add the progressbar to the root of the layout
        ViewGroup root = (ViewGroup)findViewById(android.R.id.content);
        root.addView(progressBar);

        //which data to go to what views..
        String[] fromColumns = {ContactsContract.Data.DISPLAY_NAME};
        int[] toView = {android.R.id.text1};


        //Create an empty adapter until the data are loaded
        simpleCursorAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, null, fromColumns, toView, 0);
//        setListAdapter(simpleCursorAdapter);


        //A not so dynamic adapter...
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,PROJECTION_SERVICES);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_item, R.id.list_tv,PROJECTION_SERVICES);
        getListView().setDividerHeight(0);
        getListView().setDivider(null);
//        RelativeLayout list_item= R.layout.list_item;
//        RelativeLayout shark_view = (RelativeLayout)findViewById(R.id.activity_shark);

//        int color = shark_view.getSolidColor();
//        list_item.setBackgroundColor(color);
        setListAdapter(arrayAdapter);





        //the loader
        getLoaderManager().initLoader(0, null,this);

    }


    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return new CursorLoader(this, ContactsContract.Data.CONTENT_URI, PROJECTION, SELECTION, null, null);
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        simpleCursorAdapter.swapCursor(data);

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        simpleCursorAdapter.swapCursor(null);

    }
}
