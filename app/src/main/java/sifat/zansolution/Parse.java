package sifat.zansolution;

import android.net.Uri;

import java.util.ArrayList;

/**
 * Created by Sifat on 2/2/2016.
 */
public class Parse {
    int[] banners = new int[]{R.drawable.banner1, R.drawable.banner2, R.drawable.banner3, R.drawable.banner4, R.drawable.banner5, R.drawable.banner6, R.drawable.banner7, R.drawable.banner8, R.drawable.banner9, R.drawable.banner10, R.drawable.banner11, R.drawable.banner12};
    int[] logo = banners;
    private ArrayList<Uri> bannerUriList, logoUriList;
    private ArrayList<String> titleList, tagsList;
    private ArrayList<PortfolioData> portfolioDataArrayList;

    public Parse() {
        String para = "Azole glauberite untwitching palpable bear portmanteau ungentlemanlike theobromine desmona diapedetic outquoting arr undergardener raja. Methadone undemocratic thyatira materialiser dauber herzl satiric branchiopneustic retroflexion exigency bornholm bade ahmadiya  powdiving. Euphuistically homestead beatty tungstate uncharacteristic semichaotically oniomaniac sharpie thyroiditis defunctness expertly epiclesis undocumented. Fayalite unabjured blender undertrader yesterweek awry manganin jamboree criminator laemmle geothermal disrepair lymphangiomas mottler. Swordmanship galton superillustration nonextinction fagging crimean inclementness gilder unhuman defective grewsomely generable jaundicing institutionary";
        bannerUriList = getUris(banners);
        logoUriList = getUris(logo);
        titleList = getSomeWords(banners.length, para);
        tagsList = getHashed(titleList);
        portfolioDataArrayList = new ArrayList<>();

        for (int i = 0; i < bannerUriList.size(); i++) {
            PortfolioData portfolioData = new PortfolioData(bannerUriList.get(i).toString(), logoUriList.get(i).toString(), titleList.get(i), tagsList.get(i));
            portfolioDataArrayList.add(i, portfolioData);
        }
    }

    public ArrayList<PortfolioData> getPortfolioDataArrayList() {
        return portfolioDataArrayList;
    }

    public PortfolioData getPortfolioData(int position) {
        return portfolioDataArrayList.get(position);
    }

    //add # before word
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
