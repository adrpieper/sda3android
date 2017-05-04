package examples.sda.databindingexample;

/**
 * Created by RENT on 2017-05-04.
 */

public class User {

    private String name;
    private String secName;

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getSecName() {

        return secName;
    }

    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
