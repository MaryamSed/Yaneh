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
import yaneh.yaneh.utils.Gen;

@EActivity(R.layout.activity_login)
public class LoginActivity extends BaseActivity implements contract.View {

    contract.Presenter presenter = (contract.Presenter)new Presenter();
    OrdersModel User = new OrdersModel();

@ViewById
    EditText mobile , password;
@ViewById
    Button login;
@AfterViews
    void init(){
    presenter.attachview((contract.View) this);
}
@Click
    void login(){
    User.setMobile(mobile.getText().toString());
    User.setPassword(password.getText().toString());

    presenter.login(User);

    dialog.show();
    mobile.setText("");
    password.setText("");
}

    @Override
    public void gettoken(String token) {
        Gen.toast(token);
        
        dialog.dismiss();

    }
}
