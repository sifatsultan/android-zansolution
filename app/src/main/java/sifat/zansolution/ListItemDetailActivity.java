package sifat.zansolution;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by Sifat on 1/28/2016.
 */
public class ListItemDetailActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_expand);

        Bundle b = getIntent().getExtras();
        PortfolioData portfolioData = b.getParcelable("portfolioData");

        SimpleDraweeView logoView = (SimpleDraweeView) findViewById(R.id.logo);
        SimpleDraweeView bannerView = (SimpleDraweeView) findViewById(R.id.banner);
        TextView titleView = (TextView) findViewById(R.id.title);
        TextView tagsView = (TextView) findViewById(R.id.tags);

        logoView.setImageURI(Uri.parse(portfolioData.logoUri));
        bannerView.setImageURI(Uri.parse(portfolioData.bannerUri));
        titleView.setText(portfolioData.title);
        tagsView.setText(portfolioData.tag);
    }
}
