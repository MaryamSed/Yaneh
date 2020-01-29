package yaneh.yaneh.Register;

public class Presenter implements Contract.Presenter  {
    Contract.View view;
    Contract.Model model = (Contract.Model)new Model();

    @Override
    public void attachview(Contract.View view) {
        this.view = view;
        model.attachpresenter(this);

    }
}
