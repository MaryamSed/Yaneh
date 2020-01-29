package yaneh.yaneh.Login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import yaneh.yaneh.R;
@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

@ViewById
    EditText name , family;
@ViewById
    Bundle login;
@AfterViews
    void init(){

}
@Click
    void login(){
    
}
}
