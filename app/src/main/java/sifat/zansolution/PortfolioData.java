package sifat.zansolution;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sifat on 1/31/2016.
 */
public class PortfolioData implements Parcelable{
    String bannerUri;
    String logoUri;
    String title;
    String tag;

    public static final Creator<PortfolioData> CREATOR = new Creator<PortfolioData>() {
        @Override
        public PortfolioData createFromParcel(Parcel in) {
            return new PortfolioData(in);
        }

        @Override
        public PortfolioData[] newArray(int size) {
            return new PortfolioData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    public PortfolioData(String bannerUri, String logoUri,String title, String tag){
        this.bannerUri = bannerUri;
        this.logoUri = logoUri;
        this.title = title;
        this.tag = tag;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(bannerUri);
        dest.writeString(logoUri);
        dest.writeString(title);
        dest.writeString(tag);
    }

    private PortfolioData(Parcel in){
        bannerUri = in.readString();
        logoUri = in.readString();
        title = in.readString();
        tag = in.readString();
    }
}
