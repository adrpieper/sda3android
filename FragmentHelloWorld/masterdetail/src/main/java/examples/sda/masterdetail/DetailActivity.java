package examples.sda.masterdetail;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by angelika on 25.04.17.
 */

public class DetailActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if(getIntent().hasExtra("detail")){
            //DetailFragment frag = (DetailFragment) getFragmentManager().findFragmentById(R.id.DetailFragment);
            getIntent().getStringExtra("detail");
            //frag.showBasicData();
        }
    }
}
