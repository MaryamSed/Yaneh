package yaneh.yaneh;

import android.os.Handler;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.orhanobut.hawk.Hawk;

import org.androidannotations.annotations.EActivity;

import java.util.ArrayList;
import java.util.List;

import yaneh.yaneh.recycler.citysModel;
import yaneh.yaneh.recycler.recadapter;
import yaneh.yaneh.utils.BaseActivity;
public class HomeActivity extends BaseActivity {
    DrawerLayout drawer;
    boolean backClicked = false;
    RecyclerView recycler1 ,recycler2;
    TextView welcome,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bind();
        clickOnDrawer();

        String Id = Hawk.get("name") + " " + Hawk.get("family");
        String neighborhood = Hawk.get("address");

        welcome.setText("عزیز"+Id + "خوش آمدید");
        address.setText("آدرس شما:" + neighborhood);

        citysModel golpa = new citysModel();
        golpa.setName("محصول شماره 1");

        citysModel golpa2 = new citysModel();
        golpa2.setName("محصول شماره 2");

        citysModel golpa3 = new citysModel();
        golpa3.setName("محصول شماره 3");

        List<citysModel> caar = new ArrayList<>();
        caar.add(golpa);
        caar.add(golpa2);
        caar.add(golpa3);

        recadapter adapter = new recadapter(mcontext,caar);
        recycler1.setAdapter(adapter);
        recycler2.setAdapter(adapter);
    }

    public void bind() {
        drawer = findViewById(R.id.drawer);
        recycler1=findViewById(R.id.recycler1);
        recycler2=findViewById(R.id.recycler2);
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
            finish();
        } else {
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
