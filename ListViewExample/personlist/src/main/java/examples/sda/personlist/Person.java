package examples.sda.personlist;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Adrian on 2017-04-29.
 */

public class Person extends BaseObservable{
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
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
