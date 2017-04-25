package examples.sda.masterdetail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    //private DetailFragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragment = (DetailFragment)
    }

    public void showBasicData() {
        //fragment.showBasicData();
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.DetailFragment);

        if (fragment != null && fragment.isInLayout()) {
            fragment.showBasicData();
        } else {
            Intent i = new Intent(this, DetailActivity.class);
            i.putExtra("basic", 0);
            startActivity(i);
        }
    }

    public void showDetailData() {
        //fragment.showDetailData();
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.DetailFragment);

        if (fragment != null && fragment.isInLayout()) {
            fragment.showDetailData();
        } else {

            Intent i = new Intent(this, DetailActivity.class);
            i.putExtra("detail", );
            startActivity(i);
        }
    }
}
