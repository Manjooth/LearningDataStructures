package LinkedLists;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        // Person::getName is basically a shorthand (lambda way) of doing Person.getName(Person.name)
        return Comparator.comparing(Person::getName).thenComparingInt(Person::getAge).compare(this, o);
    }
}
