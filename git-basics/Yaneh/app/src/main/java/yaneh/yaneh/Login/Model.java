package yaneh.yaneh.Login;

import com.orhanobut.hawk.Hawk;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import yaneh.yaneh.utils.Gen;

public class Model implements contract.Model {
    contract.Presenter presenter;
    String msg;

    @Override
    public void attachpresenter(contract.Presenter presenter) {
        this.presenter=(Presenter)presenter;

    }

    @Override
    public void login(OrdersModel User) {
        String mobile = User.getMobile().toString();
        String password = User.getPassword().toString();

        Gen.endpoint.login(mobile,password).enqueue((new Callback<OrdersModel>() {
            @Override
            public void onResponse(Call<OrdersModel> call, Response<OrdersModel> response) {
                int statuscode = response.code();
                if(statuscode==200){
                    msg = response.body().getToken();
                    presenter.gettoken(msg);
                    Hawk.put("token" , msg);
                }else {
                    presenter.gettoken("رمز عبور شما معتبر نیست");
                }
            }
            @Override
            public void onFailure(Call<OrdersModel> call, Throwable t) {
                presenter.gettoken("رمز عبور شما معتبر نیست..");

            }
        }));

    }
}
