package yaneh.yaneh.Login;

public class Presenter implements contract.Presenter {
    contract.View view;
    contract.Model model = (contract.Model) new Model();
    @Override
    public void attachview(contract.View view) {
        this.view=view;
        model.attachpresenter(this);

    }

    @Override
    public void login(OrdersModel User) {
        model.login(User);
    }

    @Override
    public void gettoken(String token) {
        view.gettoken(token);
    }
}
