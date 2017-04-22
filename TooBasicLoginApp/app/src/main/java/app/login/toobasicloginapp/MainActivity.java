package app.login.toobasicloginapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @BindView(R.id.editText_login)
    protected EditText login_field;

    @BindView(R.id.editText_pass)
    protected EditText pass_field;

    private UserBase userBase = new UserBase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.login_button)
    protected void submitForm(View view) {

        if (true)
        Toast.makeText(this, "Witaj " + login_field.getText().toString(), Toast.LENGTH_LONG).show();
//        Toast.makeText(this, "Telefon zrootowany, zgłoszenie na Policję dodane ", Toast.LENGTH_LONG).show();
    }
}
