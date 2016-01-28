package sifat.zansolution;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Sifat on 1/2/2016.
 */
public class PortfolioFragment extends Fragment {

    ListView lv;
    int[] banners = new int[]{R.drawable.banner1, R.drawable.banner2, R.drawable.banner3, R.drawable.banner4, R.drawable.banner5, R.drawable.banner6, R.drawable.banner7, R.drawable.banner8, R.drawable.banner9, R.drawable.banner10,R.drawable.banner11, R.drawable.banner12};
    String para = "Azole glauberite untwitching palpable bear portmanteau ungentlemanlike theobromine desmona diapedetic outquoting arr undergardener raja. Methadone undemocratic thyatira materialiser dauber herzl satiric branchiopneustic retroflexion exigency bornholm bade ahmadiya  powdiving. Euphuistically homestead beatty tungstate uncharacteristic semichaotically oniomaniac sharpie thyroiditis defunctness expertly epiclesis undocumented. Fayalite unabjured blender undertrader yesterweek awry manganin jamboree criminator laemmle geothermal disrepair lymphangiomas mottler. Swordmanship galton superillustration nonextinction fagging crimean inclementness gilder unhuman defective grewsomely generable jaundicing institutionary";
    int[] logo = banners;
    ArrayList<Uri> bannerUri = getUris(banners);
    ArrayList<Uri> logoUri = getUris(logo);
    ArrayList<String> title = getSomeWords(banners.length, para);
    ArrayList<String> tags = getHashed(title);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_portfolio,container, false);
        lv = (ListView)rootView.findViewById(R.id.listView);
        lv.setAdapter(new TheAdapter(getActivity(),bannerUri, logoUri,title,tags));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String msg = "banners: "+bannerUri.get(position)+" logo: "+logoUri.get(position)+" title :"+title.get(position)+" tags "+tags.get(position);
                Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();

            }
        });
        return rootView;
    }

    public ArrayList<String> getHashed(ArrayList<String> title) {
        ArrayList<String> tags = new ArrayList<String>();

        for (String item : title) {
            String tag = "#" + item;
            tags.add(tag);
        }
        return tags;
    }

    public ArrayList<Uri> getUris(int[] res) {
        ArrayList<Uri> uris = new ArrayList<Uri>();
        for (int item : res) {
            String path = "res:/" + String.valueOf(item);
            uris.add(Uri.parse(path));
        }
        return uris;
    }

    public ArrayList<String> getSomeWords(int num, String text) {
        String[] words = text.split("\\s+");
        ArrayList<String> someWords = new ArrayList<>();

        for (int j = 0; j < num; j++) {
            someWords.add(words[j]);
        }
        return someWords;
    }

}
