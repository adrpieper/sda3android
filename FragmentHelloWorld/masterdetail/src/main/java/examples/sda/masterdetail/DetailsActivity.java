package examples.sda.masterdetail;

import android.app.Activity;
import android.os.Bundle;


public class DetailsActivity extends Activity {
    public static final int BASIC = 0;
    public static final int DETAILS = 1;
    private DetailFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailsActivityFragment);
        if (getIntent().hasExtra("toShow")) {
            int intentValue = getIntent().getIntExtra("toShow", BASIC);
            if (intentValue == BASIC) {
                fragment.showBasicData();
            }
            if (intentValue == DETAILS) {
                fragment.showDetailsData();
            }
        }
    }
}
