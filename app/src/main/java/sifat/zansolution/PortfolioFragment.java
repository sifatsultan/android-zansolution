package sifat.zansolution;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Sifat on 1/2/2016.
 */
public class PortfolioFragment extends Fragment {
    ListView lv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_portfolio,container, false);
        lv = (ListView)rootView.findViewById(R.id.listView);
        lv.setAdapter(new TheAdapter(getActivity()));
        return rootView;

    }
}
