package yaneh.yaneh.Orders;

import java.util.List;

public interface Contract {
    interface View{
        void  getorder(String msg , List ordesr);

    }
    interface Presenter{
        void attachview(View view);
        void getorder(String msg , List orders);
        void gettoken();

    }
    interface Model{
        void attachpresenter(Presenter presenter);
        void getorder();

    }

}
