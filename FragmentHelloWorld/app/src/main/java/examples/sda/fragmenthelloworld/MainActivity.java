package examples.sda.fragmenthelloworld;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements Message {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void showMessage() {
        Toast.makeText(this,"To jest message",Toast.LENGTH_LONG).show();

    }

}
