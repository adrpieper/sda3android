package examples.sda.listviewexample;

/**
 * Created by RENT on 2017-04-29.
 */

public class Person {
    private final String name;
    private final String surname;
    private final String email;
    private final int age;

    public Person(String name, String surname, String email, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

}
