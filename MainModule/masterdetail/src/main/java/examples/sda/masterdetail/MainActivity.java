package examples.sda.masterdetail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void showBasicInformation() {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment7_text);

        if(fragment != null && fragment.isInLayout() ) {
            fragment.showBasicData();
        }else {
            passOn(0);

        }
    }

    public void showDetailInformation() {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment7_text);

        if(fragment != null && fragment.isInLayout() ) {
             fragment.showDetailInfo();
        }else {
            // start new activity
        }
    }


    public void passOn (int n) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}
