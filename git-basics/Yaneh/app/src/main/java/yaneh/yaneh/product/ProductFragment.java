package yaneh.yaneh.product;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import yaneh.yaneh.R;

public class ProductFragment extends Fragment {
    List<ProductModel> prod = new ArrayList<>();

    RecyclerView rec;
    //Context mcontext=this;
    private static ProductFragment fragment;
    public  static ProductFragment getFragment(){
        if (fragment==null)
            fragment = new ProductFragment();
        return fragment;
    }


    //    private static OpinionFragment fragment;
//    public  static OpinionFragment getFragment(){
//        if (fragment==null)
//            fragment = new OpinionFragment();
//        return fragment;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.product_fargment , container , false);
        rec = v.findViewById(R.id.rec);

        pro();

        DetailProdactadapter adapter = new DetailProdactadapter(prod);
        rec.setAdapter(adapter);

        return v;
    }

    public List pro(){
        ProductModel p1 = new ProductModel();
        p1.setName("ggg1");
        p1.setPrice(10);

        ProductModel p2 = new ProductModel();
        p2.setName("ggg2");
        p2.setPrice(10);

        ProductModel p3 = new ProductModel();
        p3.setName("ggg3");
        p3.setPrice(10);

        prod.add(p1);
        prod.add(p2);
        prod.add(p3);

        return prod;
    }
}
