package yaneh.yaneh.Login;

public class Model implements contract.Model {
    contract.Presenter presenter;

    @Override
    public void attachpresenter(contract.Presenter presenter) {
        this.presenter=presenter;

    }
}
