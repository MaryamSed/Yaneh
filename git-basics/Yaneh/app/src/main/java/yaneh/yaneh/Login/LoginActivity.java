package yaneh.yaneh.Login;

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

@EActivity(R.layout.activity_login)
public class LoginActivity extends BaseActivity {
    contract.Presenter presenter = (contract.Presenter)new Presenter();

@ViewById
    EditText name , family;
@ViewById
    Button login;
@AfterViews
    void init(){
    presenter.attachview((contract.View) this);
}
@Click
    void login(){

}
}
