package examples.sda.masterdetail;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private DetailFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment7_text);
    }


    public void showBasicInformation() {

        fragment.showBasicData();

    }

    public void showDetailInformation() {

        fragment.showDetailInfo();

    }

}
