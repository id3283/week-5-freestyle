package inheritance;

public class Doctor extends Person {
    String speciality;

    public Doctor(String name) {
        super(name);
    }


    public void work() {
        System.out.println("I'm a doctor, and I'm doing gross stuff.");
    }

}
