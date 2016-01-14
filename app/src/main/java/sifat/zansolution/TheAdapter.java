package sifat.zansolution;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

/**
 * Created by Sifat on 1/5/2016.
 */
public class TheAdapter extends BaseAdapter {

    int[] banners = new int[]{R.drawable.banner1, R.drawable.banner2, R.drawable.banner3, R.drawable.banner4, R.drawable.banner5, R.drawable.banner6, R.drawable.banner7, R.drawable.banner8, R.drawable.banner9, R.drawable.banner10,R.drawable.banner11, R.drawable.banner12};
    int[] logo = banners;
    ArrayList<Uri> bannerUri = getUris(banners);
    ArrayList<Uri> logoUri = getUris(logo);
    ArrayList<String> title = getSomeWords(banners.length);
    ArrayList<String> tags = getHashed(title);
    Context mContext;
    private LayoutInflater mLayoutInflater;

    public TheAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return banners.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RelativeLayout itemView;
        if (convertView == null) {
            itemView = (RelativeLayout) mLayoutInflater.inflate(
                    R.layout.list_itemc, parent, false);

        } else {
            itemView = (RelativeLayout) convertView;
        }

        SimpleDraweeView logoView = (SimpleDraweeView) itemView.findViewById(R.id.logo);
        SimpleDraweeView bannerView = (SimpleDraweeView) itemView.findViewById(R.id.banner);

//        ImageView logoView = (ImageView)itemView.findViewById(R.id.logo);
//        ImageView bannerView = (ImageView)itemView.findViewById(R.id.banner);
        TextView titleView = (TextView) itemView.findViewById(R.id.title);
        TextView tagsView = (TextView) itemView.findViewById(R.id.tags);

//        String path = "res:/" + R.drawable.default_app; // Only one slash after res:

        logoView.setImageURI(logoUri.get(position));
        bannerView.setImageURI(bannerUri.get(position));
        titleView.setText(title.get(position));
        tagsView.setText(tags.get(position));

        return itemView;
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


    public ArrayList<String> getSomeWords(int num) {
        String para = "Azole glauberite untwitching palpable bear portmanteau ungentlemanlike theobromine desmona diapedetic outquoting arr undergardener raja. Methadone undemocratic thyatira materialiser dauber herzl satiric branchiopneustic retroflexion exigency bornholm bade ahmadiya powdiving. Euphuistically homestead beatty tungstate uncharacteristic semichaotically oniomaniac sharpie thyroiditis suppï¿¥ï¾½ defunctness expertly epiclesis undocumented. Fayalite unabjured blender undertrader yesterweek awry manganin jamboree criminator laemmle geothermal disrepair lymphangiomas mottler. Swordmanship galton superillustration nonextinction fagging crimean inclementness gilder unhuman defective grewsomely generable jaundicing institutionary";
        String[] words = para.split("\\s+");
        ArrayList<String> someWords = new ArrayList<>();

        for (int j = 0; j < num; j++) {
            someWords.add(words[j]);
        }
        return someWords;
    }

}
