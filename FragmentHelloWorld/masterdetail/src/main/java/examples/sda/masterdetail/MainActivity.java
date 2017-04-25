package examples.sda.masterdetail;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;

import static examples.sda.masterdetail.R.id.fragment;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showBasicData(){
        DatailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        fragment.showBasicData();
    }

    public void showBasicData(){
        fragment.showDetailsData();
    }
}
