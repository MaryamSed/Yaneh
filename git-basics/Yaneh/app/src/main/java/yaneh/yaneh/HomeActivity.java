package yaneh.yaneh;

import android.os.Handler;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.orhanobut.hawk.Hawk;

import org.androidannotations.annotations.EActivity;

import java.util.ArrayList;
import java.util.List;

import yaneh.yaneh.utils.BaseActivity;
public class HomeActivity extends BaseActivity {
    DrawerLayout drawer;
    boolean backClicked = false;
    RecyclerView recycler;
    TextView welcome,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bind();
        clickOnDrawer();

        String Id = Hawk.get("name") + " " + Hawk.get("family");
        String naibore = Hawk.get("address");

        welcome.setText("خوش آمدید"+Id + "عزیز");
        address.setText("آدرس شما:" + naibore);

        CityModel golpayegan = new CityModel();
        golpayegan.setCityname("گلپایگان");

        List<CityModel> city = new ArrayList<>();
        city.add(golpayegan);

        RecyclerCityAdapter adapter = new RecyclerCityAdapter(mcontext , city);
        recycler.setAdapter(adapter);
        //showRecyclerView();
    }

//    public void showRecyclerView() {
//        CityModel golpayegan = new CityModel();
//        golpayegan.setCityname("گلپایگان");
//
//        List<CityModel> citys = new ArrayList<>();
//        citys.add(golpayegan);
//
//        RecyclerCityAdapter adapter = new RecyclerCityAdapter(mcontext , citys);
//        recycler.setAdapter(adapter);
//
//    }

    public void bind() {
        drawer = findViewById(R.id.drawer);
        recycler=findViewById(R.id.recycler);
        welcome=findViewById(R.id.welcome);
        address=findViewById(R.id.address);
    }

    public void clickOnDrawer() {
        findViewById(R.id.inDrawer).setOnClickListener(V -> {
            if (!drawer.isDrawerOpen(Gravity.RIGHT))
                drawer.openDrawer(Gravity.RIGHT);
            else
               drawer.closeDrawer(Gravity.RIGHT);
        });
    }

    @Override
    public void onBackPressed() {
        if (backClicked) {
            //second time
            finish();
        } else {
            //first time
            backClicked = true;
           Toast.makeText(mcontext, "برای خروج دکمه بازگشت را دوباره بزنید", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    backClicked = false ;
                }
           },2500) ;
        }

    }
}
