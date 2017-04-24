package examples.sda.masterdetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private DetailFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // WAŻNE, ZAPAMIĘTAJ!
        fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_fragment);
        showBasicData();
    }

    public void showBasicData() {

        fragment.showBasicData();
    }

    public void showDetailedData() {

        fragment.showDetailedData();
    }
}
