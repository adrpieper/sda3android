package examples.sda.masterdetail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showBasicData() {

        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_fragment);
        if (fragment !=null && fragment.isInLayout()) {

            fragment.showBasicData();
        } else {
            // start new activity
            Intent i = new Intent(this, DetailActivity.class);
            i.putExtra("shown", DetailActivity.BASIC);
            startActivity(i);
        }
    }

    public void showDetailedData() {

        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_fragment);
        if (fragment != null && fragment.isInLayout()) {

            fragment.showDetailedData();
        } else {

        }
    }
}
