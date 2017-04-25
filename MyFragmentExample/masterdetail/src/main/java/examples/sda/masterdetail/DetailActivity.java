package examples.sda.masterdetail;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity {

    public static final int DETAIL = 1;
    public static final int BASIC = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final int data = getIntent().getIntExtra("shown", DETAIL);
        if (data == BASIC) {
            //showBasic
            DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_fragment);
            detailFragment.showBasicData();
        } else if (data == DETAIL) {

            DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_fragment);
            detailFragment.showDetailedData();
        }

    }
}
