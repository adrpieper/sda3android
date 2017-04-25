package examples.sda.masterdetail;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends Activity {



    DetailFragment detailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment7_text);

        int message = getIntent().getIntExtra("message", -1);

        if(message == MainActivity.DETAIL){
            detailFragment.showDetailInfo();
        }else if (message == MainActivity.BASIC){
            detailFragment.showBasicData();
        } else {

            Toast.makeText(this, "There is no such data", Toast.LENGTH_SHORT).show();
        }

    }

}
