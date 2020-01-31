package yaneh.yaneh.Orders;

public class Model implements Contract.Model{
    Contract.Presenter presenter;

    @Override
    public void attachpresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }
}
