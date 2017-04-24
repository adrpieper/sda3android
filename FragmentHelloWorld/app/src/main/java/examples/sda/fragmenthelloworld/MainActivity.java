package examples.sda.fragmenthelloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage() {
        Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show();
    }
}
