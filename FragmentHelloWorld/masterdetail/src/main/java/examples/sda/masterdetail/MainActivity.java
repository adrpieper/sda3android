package examples.sda.masterdetail;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;

import static examples.sda.masterdetail.R.id.fragment;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //showDetailData();
        showBasicData();

    }

    public void showBasicData() {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        if (fragment != null && fragment.isInLayout()) {
            fragment.showBasicData();
        }
        else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("data",DetailActivity.BASIC);
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
            intent.putExtra("data",DetailActivity.DETAIL);
            startActivity(intent);
        }
    }

}
