package examples.sda.accel;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Medard on 2017-04-28.
 */

public class FragmentAccelerometer extends Fragment {

//    Accelerometer accel;
//    InterfaceAccelerometer accel;
    private TextView value_x;
    private TextView value_y;
    private TextView value_z;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate (R.layout.accelerometer_fragment, container, false);
        super.onCreate (savedInstanceState);
        setVal();

        value_x = (TextView) view.findViewById (R.id.axis_x);
        value_y = (TextView) view.findViewById (R.id.axis_y);
        value_z = (TextView) view.findViewById (R.id.axis_z);

        return view;
    }
    void setVal(){

        View acctivity = getActivity ().getSystemService ();
    InterfaceAccelerometer accel = new Accelerometer ();
            accel.
            float valu_x = (accel.getVal_x ());
            String string_x = String.valueOf(valu_x);
            value_x.setText(string_x);

            float valu_y = (accel.getVal_y ());
            String string_y = String.valueOf(valu_y);
            value_y.setText(string_y);

            float valu_z = (accel.getVal_z ());
            String string_z = String.valueOf(valu_z);
            value_z.setText(string_z);
    }
}