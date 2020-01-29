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
@EActivity(R.layout.activity_register)
public class RegisterActivity extends AppCompatActivity {

    @ViewById
    EditText name , family , mobile;
    @ViewById
    Button register;

    @AfterViews
    void init(){

    }

    @Click
    void register(){

    }

}
