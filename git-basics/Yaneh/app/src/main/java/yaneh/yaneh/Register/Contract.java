package yaneh.yaneh.Register;

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
