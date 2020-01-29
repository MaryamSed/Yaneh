package yaneh.yaneh.Login;

public interface contract {
    interface View{

    }
    interface Presenter{
        void attachview(View view);

    }
    interface Model{
        void attachpresenter(Presenter presenter);

    }
}
