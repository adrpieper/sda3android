package examples.sda.dbexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Medard on 2017-05-04.
 */

public class User extends BaseObservable{
    private String name;
    private String last;
    private int age;

    public User(String name, String last, int age) {
        this.name = name;
        this.last = last;
        this.age = age;
    }
    @Bindable
    public String getName() {
        return name;
    }
    @Bindable
    public String getLast() {
        return last;
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
        notifyPropertyChanged(BR.last);
    }

    public void setLast(String last) {
        this.last = last;
        notifyPropertyChanged(BR.age);
    }
}
