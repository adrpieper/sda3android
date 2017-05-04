package examples.sda.dbexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.Observable;

/**
 * Created by angelika on 04.05.17.
 */

public class User extends BaseObservable {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.user);
    }

    @Bindable
    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }


}
