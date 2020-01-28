package yaneh.yaneh.CustomView;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import yaneh.yaneh.utils.BaseApplication;

public class MyButton extends AppCompatButton {
    public MyButton(Context context) {
        super(context);
        setTypeface(BaseApplication.appface);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(BaseApplication.appface);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(BaseApplication.appface);
    }
}
