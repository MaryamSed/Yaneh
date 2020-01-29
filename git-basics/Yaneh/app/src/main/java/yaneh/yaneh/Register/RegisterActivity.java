package yaneh.yaneh.Register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import yaneh.yaneh.R;
import yaneh.yaneh.utils.BaseActivity;

@EActivity(R.layout.activity_register)
public class RegisterActivity extends BaseActivity implements Contract.View {

    Identity User = new Identity();
    Contract.Presenter presenter = (Contract.Presenter)new Presenter();

    @ViewById
    EditText name , family , mobile;
    @ViewById
    Button register;

    @AfterViews
    void init(){

        presenter.attachview(this);

    }

    @Click
    void register(){
        User.setName(name.getText().toString());
        User.setFamily(family.getText().toString());
        User.setMobile(mobile.getText().toString());



        dialog.show();

        User.setName("");
        User.setFamily("");
        User.setMobile("");

    }

}
