package examples.sda.fragmenthelloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import butterknife.ButterKnife;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    public void showMessage() {
        Toast.makeText(getApplicationContext(), "Message", Toast.LENGTH_SHORT).show();
    }
}
