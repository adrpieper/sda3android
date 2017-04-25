package examples.sda.masterdetail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showBasicData();
    }

    public void showBasicData() {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);

        if (fragment != null && fragment.isInLayout()) {
            fragment.showBasicData();
        }
        else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("data", DetailActivity.BASIC);
            startActivity(intent);
        }
    }

    public void showDetailData() {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);

        if (fragment != null && fragment.isInLayout()) {
            fragment.showDetailData();
        }
        else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("data", DetailActivity.DETAIL);
            startActivity(intent);
        }
    }
}
