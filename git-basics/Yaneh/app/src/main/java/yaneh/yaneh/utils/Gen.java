package yaneh.yaneh.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import yaneh.yaneh.BuildConfig;
import yaneh.yaneh.utils.Retrofit.EndPoint;
import yaneh.yaneh.utils.Retrofit.Generator;

public class Gen {

    public static EndPoint endpoint = Generator.createService(EndPoint.class);

    public static void toast(String msg){
        Toast.makeText(BaseApplication.app, msg, Toast.LENGTH_SHORT).show();
    }

     public static void log(String tag , String msg ){
        if (BuildConfig.DEBUG)
            Log.d(tag,msg);
     }

    public static void log( String msg ){
        if (BuildConfig.DEBUG)
            Log.d("debug_log",msg);
    }
}
