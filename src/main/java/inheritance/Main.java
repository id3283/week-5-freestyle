package inheritance;

public class Main {
    public static void main(String[] args) {

        Person p;
        p = new Developer("Silver", 22, "Java");

        p.work();

//        Developer d = new Developer("Silver", 22, "Java");
//        System.out.println(p.getClass());

        if (p instanceof Developer) {
            Developer d = (Developer) p;
            d.beLazy();
        }


        System.out.println();


    }
}
