package examples.sda.masterdetail;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
private DetailFragment detail_fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        detail_fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment3);
        detail_fragment.showBasicData();
    }
}
