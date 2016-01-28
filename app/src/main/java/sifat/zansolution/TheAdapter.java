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

    Context mContext;
    private LayoutInflater mLayoutInflater;
    ArrayList<Uri> bannerUri, logoUri;
    ArrayList<String> title,tags;


    public TheAdapter(final Context context, ArrayList<Uri> banners, ArrayList<Uri> logo, ArrayList<String> title, ArrayList<String> tags) {
        this.mContext = context;
        mLayoutInflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.bannerUri = banners;
        this.logoUri = logo;
        this.title = title;
        this.tags = tags;
    }

    @Override
    public int getCount() {
        return bannerUri.size();
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
        TextView titleView = (TextView) itemView.findViewById(R.id.title);
        TextView tagsView = (TextView) itemView.findViewById(R.id.tags);

//        String path = "res:/" + R.drawable.default_app; // Only one slash after res:
        logoView.setImageURI(logoUri.get(position));
        bannerView.setImageURI(bannerUri.get(position));
        titleView.setText(title.get(position).toUpperCase());
        tagsView.setText(tags.get(position));

        return itemView;
    }

}
