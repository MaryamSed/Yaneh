package yaneh.yaneh.Orders;

import com.orhanobut.hawk.Hawk;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import yaneh.yaneh.utils.Gen;

public class Model implements Contract.Model{
    Contract.Presenter presenter;
    String msg;

    @Override
    public void attachpresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getorder() {
        String token = Hawk.get("token");
        Gen.endpoint.orders(token).enqueue(new Callback<List<OrdersModel>>() {
            @Override
            public void onResponse(Call<List<OrdersModel>> call, Response<List<OrdersModel>> response) {
             List<OrdersModel> orders = response.body();
             if(orders.size()>0){
                 msg="OK";
                 presenter.getorder(msg , orders);
             }else {
                 msg = "no item found";
                 presenter.getorder(msg , orders);
             }
            }

            @Override
            public void onFailure(Call<List<OrdersModel>> call, Throwable t) {
                msg=t.toString();
            }
        });

    }
}
