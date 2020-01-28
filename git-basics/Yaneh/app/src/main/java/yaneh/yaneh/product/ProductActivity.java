package yaneh.yaneh.product;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

import yaneh.yaneh.R;

public class ProductActivity extends AppCompatActivity {

    ViewPager pager;
    SmartTabLayout tabs ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        pager = findViewById(R.id.pager);
        tabs = findViewById(R.id.tab);

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

        tabs.setViewPager(pager);

    }
}
