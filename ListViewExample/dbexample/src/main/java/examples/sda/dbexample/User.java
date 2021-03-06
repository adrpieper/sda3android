package examples.sda.dbexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Adrian on 2017-05-04.
 */

public class User extends BaseObservable {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    @Bindable
    public String getName() {
        return name;
    }
}
