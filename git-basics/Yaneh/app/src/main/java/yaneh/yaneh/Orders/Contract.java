package yaneh.yaneh.Orders;

public interface Contract {
    interface View{

    }
    interface Presenter{
        void attachview(View view);

    }
    interface Model{
        void attachpresenter(Presenter presenter);

    }

}
