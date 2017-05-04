package examples.sda.databindingexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by RENT on 2017-05-04.
 */

public class User extends BaseObservable{

    private String name;
    private String secName;
    private int age;

    public void setSecName(String secName) {
        this.secName = secName;
        notifyPropertyChanged(BR.secName);
    }
    @Bindable
    public String getSecName() {
        return secName;

    }


    @Bindable
    public String getName() {
        return name;
    }
    @Bindable
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
