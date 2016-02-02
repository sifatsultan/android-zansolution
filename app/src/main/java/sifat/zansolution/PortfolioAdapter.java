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
public class PortfolioAdapter extends BaseAdapter {

    Context mContext;
    private LayoutInflater mLayoutInflater;
    ArrayList<PortfolioData> portfolioDataArrayList;

    public PortfolioAdapter(final Context context, ArrayList<PortfolioData> portfolioDataArrayList) {
        this.mContext = context;
        mLayoutInflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.portfolioDataArrayList = portfolioDataArrayList;
    }

    @Override
    public int getCount() {
        return portfolioDataArrayList.size();
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
        if (convertView == null){
            itemView = (RelativeLayout) mLayoutInflater.inflate(
                    R.layout.list_item, parent, false);

        } else {
            itemView = (RelativeLayout) convertView;
        }

        SimpleDraweeView logoView = (SimpleDraweeView) itemView.findViewById(R.id.logo);
        SimpleDraweeView bannerView = (SimpleDraweeView) itemView.findViewById(R.id.banner);
        TextView titleView = (TextView) itemView.findViewById(R.id.title);
        TextView tagsView = (TextView) itemView.findViewById(R.id.tags);

        logoView.setImageURI(Uri.parse(portfolioDataArrayList.get(position).logoUri));
        bannerView.setImageURI(Uri.parse(portfolioDataArrayList.get(position).bannerUri));
        titleView.setText(portfolioDataArrayList.get(position).title.toUpperCase());
        tagsView.setText(portfolioDataArrayList.get(position).tag);

        return itemView;
    }
}