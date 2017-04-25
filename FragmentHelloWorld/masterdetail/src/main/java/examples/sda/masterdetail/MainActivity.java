package examples.sda.masterdetail;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity implements ButtonInterface {

    private DetailFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        // showBasicData();
    }

    @Override
    public void showBasicData() {
        //  DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        if (fragment != null && fragment.isInLayout()) {
            fragment.showBasicData();
        } else {
            showDetailsInDetailsActivity(DetailsActivity.BASIC);
        }
    }

    @Override
    public void showDetailsData() {
        //   DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        if (fragment != null && fragment.isInLayout()) {
            fragment.showDetailsData();
        } else {
            showDetailsInDetailsActivity(DetailsActivity.DETAILS);
        }
    }

    private void showDetailsInDetailsActivity(int show) {
        Intent i = new Intent(getApplicationContext(), DetailsActivity.class);
        i.putExtra("toShow", show);
        startActivity(i);
    }
}
