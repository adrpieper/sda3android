package app.login.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ok_click(View view) {
        Toast.makeText(getApplicationContext(), "Zalogowano", Toast.LENGTH_SHORT).show();

    }
}
