public class InstancesDemo {

    public static void main(String[] args) {
        Student student1 = new Student("Ahmad", 1);
        Student student2 = new Student("Zo", 26);

        System.out.println("institution for " + student1.getName() + " is " + student1.institution);
        System.out.println("institution for " + student2.getName() + " is " + student2.institution);

        System.out.println("institution for " + student1.getName() + " is " + student1.institution);
        System.out.println("institution for " + student2.getName() + " is " + student2.institution);

        student1.introduce();
        student2.introduce();


        // This will make student2 reference the same object as student1
        // What happens to the object that student2 used to point to?
        // It goes in the garbage.  You no longer have a pointer to it, you can't access it.
//        student2 = student1;

    }
}
