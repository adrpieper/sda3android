package examples.sda.masterdetail;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity {

    public static final int BASIC = 0;
    public static final int DETAIL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final int data = getIntent().getIntExtra("data", BASIC);
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);

        if (data == BASIC) {
            fragment.showBasicData();

        } else if (data == DETAIL) {
            fragment.showDetailData();

        }
    }
}

