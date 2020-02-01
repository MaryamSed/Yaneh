package yaneh.yaneh.Orders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.List;

import yaneh.yaneh.HomeActivity;
import yaneh.yaneh.R;
import yaneh.yaneh.utils.BaseActivity;

@EActivity(R.layout.activity_orders)
public class OrdersActivity extends BaseActivity implements Contract.View {
    Contract.Presenter presenter = (Contract.Presenter) new Presenter();
    @ViewById
    ListView orderslist;
    @ViewById
    Button home;

    @AfterViews
    void init(){
        presenter.attachview((Contract.View) this);
        presenter.gettoken();
    }


    @Override
    public void getorder(String msg, List ordesr) {
        if(msg=="OK"){
            OrdersListAdapter adapter = new OrdersListAdapter(mcontext,ordesr);
            orderslist.setAdapter(adapter);
        }

    }
    @Click
    void home(){
        startActivity(new Intent(mcontext , HomeActivity.class));

    }
}
