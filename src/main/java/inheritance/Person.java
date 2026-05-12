package inheritance;

public class Person {
    String name;
    int age = 25;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
//        System.out.println("I'm making a baby!");
    }
    public Person(){}

    public void work() {
        System.out.println("I'm a person, and I'm working.");
    }

    public void greet() {
        System.out.println("Howdy");
    }

    public Person(String name) {
        this.name = name;
//        System.out.println("I'm making a baby!");
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
}
