package examples.sda.masterdetail;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

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
           int intentValue = getIntent().getIntExtra("toShow", 0);
            if(intentValue == BASIC) {
                fragment.showBasicData();
            }
            if(intentValue == DETAILS) {
                fragment.showDetailsData();
            }
        }
    }
}
/*    if(Integer.valueOf(getIntent().getStringExtra("toShow").toString()) == BASIC) {

            }
            if(Integer.valueOf(getIntent().getStringExtra("toShow").toString()) == DETAILS) {

            }
        }*/