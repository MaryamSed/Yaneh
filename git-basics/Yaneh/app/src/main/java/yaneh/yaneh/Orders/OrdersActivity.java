package yaneh.yaneh.Orders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import yaneh.yaneh.R;
@EActivity(R.layout.activity_orders)
public class OrdersActivity extends AppCompatActivity {
    Contract.Presenter presenter = (Contract.Presenter) new Presenter();

    @AfterViews
    void init(){
        presenter.attachview((Contract.View) this);
    }



}
