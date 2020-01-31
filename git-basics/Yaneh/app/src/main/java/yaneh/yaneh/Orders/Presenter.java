package yaneh.yaneh.Orders;

import java.util.List;

public class Presenter implements Contract.Presenter {
    Contract.View view;
    Contract.Model model = (Contract.Model) new Model();
    @Override
    public void attachview(Contract.View view) {
        this.view = view;
        model.attachpresenter(this);
    }

    @Override
    public void getorder(String msg, List orders) {
        view.getorder(msg,orders);
    }

    @Override
    public void gettoken() {
        model.getorder();
    }
}
