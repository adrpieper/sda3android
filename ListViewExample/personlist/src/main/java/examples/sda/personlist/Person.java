package examples.sda.personlist;

/**
 * Created by RENT on 2017-04-29.
 */

public class Person {
    private String name;
    private  int age;
    public Person(){}

    public Person (String name, int age){
        this.name = name;
        this.age =age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
