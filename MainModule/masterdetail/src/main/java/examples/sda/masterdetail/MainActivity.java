package examples.sda.masterdetail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {


    final static int BASIC = 0;
    final static int DETAIL =1;

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
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("message",BASIC);
            startActivity(intent);

        }
    }

    public void showDetailInformation() {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment7_text);

        if(fragment != null && fragment.isInLayout() ) {
             fragment.showDetailInfo();
        }else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("message",DETAIL);
            startActivity(intent);
        }
    }



}
