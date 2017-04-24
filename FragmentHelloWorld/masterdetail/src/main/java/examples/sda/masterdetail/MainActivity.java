package examples.sda.masterdetail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DetailFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);

    }


    public void showBasicInfo() {
        fragment.showBasicInfo();
    }

    public void showDetails() {
        fragment.showDetails();
    }
}
