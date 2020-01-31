package yaneh.yaneh.Login;

public interface contract {
    interface View{
        void gettoken(String token);

    }
    interface Presenter{
        void attachview(View view);
        void login(OrdersModel User);
        void gettoken(String token);

    }
    interface Model{
        void attachpresenter(Presenter presenter);
        void login(OrdersModel User);

    }
}
