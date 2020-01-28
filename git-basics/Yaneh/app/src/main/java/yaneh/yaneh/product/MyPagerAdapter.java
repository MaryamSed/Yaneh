package yaneh.yaneh.product;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0)
            return ProductFragment.getFragment();
        if(i==1)
            return OpinionFragment.getFragment();
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int i) {
        if (i == 0)
            return "محصولات" ;
        if (i == 1)
            return "نظرات" ;
        return super.getPageTitle(i);
    }

    @Override
    public int getCount() {
        return 2;
    }
}



//    ViewPager pager;
//    SmartTabLayout tab;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_pro);
//        bind();
//
//        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
//        pager.setAdapter(adapter);
//        tab.setViewPager(pager);
//    }
//
//    public void bind() {
//        pager = findViewById(R.id.pager);
//        tab = findViewById(R.id.tab);
