package yaneh.yaneh.utils;

import android.app.Application;
import android.graphics.Typeface;

public class BaseApplication extends Application {
    public static BaseApplication app;
    public static Typeface appface;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        appface = Typeface.createFromAsset(getAssets(),"B Yekan+.ttf");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
