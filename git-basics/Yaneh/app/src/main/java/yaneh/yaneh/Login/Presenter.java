package yaneh.yaneh.Login;

public class Presenter implements contract.Presenter {
    contract.View view;
    contract.Model model = (contract.Model) new Model();
    @Override
    public void attachview(contract.View view) {
        this.view=view;
        model.attachpresenter(this);

    }
}
