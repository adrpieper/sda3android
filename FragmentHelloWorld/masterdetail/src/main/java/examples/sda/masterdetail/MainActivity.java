package examples.sda.masterdetail;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    private DetailFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        // showBasicData();
    }

    public void showBasicData() {
        //  DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        if (fragment != null && fragment.isInLayout()) {
            fragment.showBasicData();
        } else {
            showDetailsInDetailsActivity(0);
        }
    }

    public void showDetailsData() {
        //   DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        if (fragment != null && fragment.isInLayout()) {
            fragment.showDetailsData();
        } else {
            showDetailsInDetailsActivity(1);
        }
    }

    private void showDetailsInDetailsActivity(int show) {
        Intent i = new Intent(getApplicationContext(), DetailsActivity.class);
        i.putExtra("toShow", show);
        startActivity(i);
    }
}
