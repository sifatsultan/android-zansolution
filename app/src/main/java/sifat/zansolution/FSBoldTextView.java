package sifat.zansolution;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Sifat on 1/5/2016.
 */
public class FSBoldTextView extends TextView {
    public FSBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/fsbold.otf"));
    }
}
