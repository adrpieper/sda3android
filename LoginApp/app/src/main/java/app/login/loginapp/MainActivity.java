package app.login.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    UsersService us;

    @BindView(R.id.button)
    protected Button button;

    @BindView(R.id.editText)
    protected EditText editText;

    @BindView(R.id.editText3)
    protected EditText editText3;

    @OnClick(R.id.button)
    protected void onButtonClickMethod(View v) {
        if (v instanceof Button) {
            Button clickedButton = (Button) v;
            if (us.hashMapWithUsers.get(editText.getText().toString()).equals(editText3.getText().toString())) {
                Toast.makeText(getApplicationContext(), editText.getText().toString() + " You log in to the system", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(getApplicationContext(), "Wrong Password or user unknown", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        us= new UsersService(getResources());
        us.load();
    }
}
