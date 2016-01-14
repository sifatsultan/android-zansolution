package sifat.zansolution;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Sifat on 1/2/2016.
 */
public class StoryActivity extends FragmentActivity {
    ViewPager mPager;
    PagerAdapter mPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Fresco.initialize(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_swipe);

        mPager = (ViewPager)findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new StoryFreshFragment();
                case 1:
                    return new FindFragment();
                case 2:
                    return new PortfolioFragment();
                default:
                    return new StoryFreshFragment();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
