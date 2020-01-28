package yaneh.yaneh.CustomView;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import yaneh.yaneh.utils.BaseApplication;

public class MyTextView extends AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
        setTypeface(BaseApplication.appface);
      //  setTypeFace(  context) ;

    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(BaseApplication.appface);

        // setTypeFace(BaseApplication.appface) ;

    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(BaseApplication.appface);

        // setTypeFace(  context) ;

    }

   // void setTypeFace(Context mContext){
       // Typeface irSans = Typeface.createFromAsset(
       //         mContext.getAssets() , "ir_sans.ttf"
       // ) ;
      //  this.setTypeface(irSans);
   // }
}
