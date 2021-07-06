package BinarySearchTree;

public class PersonExample implements Comparable<PersonExample> {

    private int age;
    private String name;

    public PersonExample(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(PersonExample o) {
        return Integer.compare(o.getAge(), age);
    }

    @Override
    public String toString() {
        return "PersonExample{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
