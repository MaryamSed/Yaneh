package yaneh.yaneh.Register;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import yaneh.yaneh.utils.Gen;

public class Model implements Contract.Model {
    Presenter presenter;

    @Override
    public void attachpresenter(Contract.Presenter presenter) {
        this.presenter=(Presenter) presenter;
    }

    @Override
    public void registerUser(Identity User) {
        String name = User.getName().toString();
        String family = User.getFamily().toString();
        String mobile = User.getMobile().toString();

        Gen.endpoint.register(name,family,mobile).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if(response.code() == 200) {
                    presenter.get_msg("اطلاعات شما با موفقیت ثبت شد");
                }else{
                    presenter.get_msg("لطفا مجدد تلاش کنید");
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                presenter.get_msg("لطفا مجدد تلاش کنید..");
            }
        });

    }
}
