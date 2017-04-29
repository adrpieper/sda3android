package examples.sda.personlist;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private PersonProvider personProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
