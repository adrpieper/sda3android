package examples.sda.masterdetail;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends Activity {

    private DetailFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);

    }

    public void showBasicData() {
        fragment.showBasicData();
    }

    public void showDetailData() {
        fragment.showDetailData();

    }
}
