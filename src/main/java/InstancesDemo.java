public class InstancesDemo {

    public static void main(String[] args) {
        Student student1 = new Student("Ahmad", 1);

        student1.addCommits();

        Student student2 = new Student("Zo", 26);
//
//        System.out.println( Student.getInstitution() );
//
//        System.out.println( student1.getName() + "|" + student1.getCommits() );
//
//        System.out.println( student1.getPipeCsv() );
//
//        System.out.println( toPipeCsv(student1));

        // This will make student2 reference the same object as student1
        // What happens to the object that student2 used to point to?
        // It goes in the garbage.  You no longer have a pointer to it, you can't access it.
//        student2 = student1;

        InstancesDemo instancesDemo = new InstancesDemo();
        instancesDemo.sayHi();

        InstancesDemo.sayHiStatic();

    }

    public static String toPipeCsv(Student s) {
        return s.getName() + "|" + s.getCommits();
    }

    public void sayHi() {
        System.out.println("'Sup, yo?");
    }

    public  static void sayHiStatic() {
        System.out.println("Hi static");
    }
}
