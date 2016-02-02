package sifat.zansolution;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Sifat on 1/2/2016.
 */
public class PortfolioFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_portfolio, container, false);
        final Parse parse = new Parse();

        ListView lv = (ListView)rootView.findViewById(R.id.listView);
        lv.setAdapter(new PortfolioAdapter(getActivity(), parse.getPortfolioDataArrayList()));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(),ListItemDetailActivity.class);
                intent.putExtra("portfolioData",parse.getPortfolioData(position));
//                intent.putExtra("data",.getPortfolioData(position));
                startActivity(intent);
            }
        });
        return rootView;
    }

}
