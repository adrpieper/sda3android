package examples.sda.dbexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by szyms on 5/4/17.
 */

public class User extends BaseObservable {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public int getAge() {
        return age;
    }


}
