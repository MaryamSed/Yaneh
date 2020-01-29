package yaneh.yaneh.Register;

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



    }
}
