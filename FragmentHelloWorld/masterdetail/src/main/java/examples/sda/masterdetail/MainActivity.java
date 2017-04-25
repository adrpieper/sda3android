package examples.sda.masterdetail;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }







    public void showBasicInfo () {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment_detail);
        if (fragment != null && fragment.isInLayout() ) {
            fragment.showBasicInfo();
        } else {
            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("isDetailInfo",Main2Activity.NOT_DETAIL);


            startActivity(i);
        }




    }

    public void showDetailInfo() {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment_detail);

        if (fragment != null && fragment.isInLayout() ) {
            fragment.showDetailInfo();
        } else {
            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("isDetailInfo",Main2Activity.DETAIL);

            startActivity(i);
        }
    }





}
