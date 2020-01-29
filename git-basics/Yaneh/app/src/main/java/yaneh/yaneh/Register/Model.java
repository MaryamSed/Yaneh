package yaneh.yaneh.Register;

public class Model implements Contract.Model {
    Presenter presenter;

    @Override
    public void attachpresenter(Contract.Presenter presenter) {
        this.presenter=(Presenter) presenter;
    }

    @Override
    public void registerUser(Identity User) {

    }
}
