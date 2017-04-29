package examples.sda.listviewexample;

/**
 * Created by RENT on 2017-04-29.
 */

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Imię: " + name + ", Wiek: " + age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {

    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }


}
