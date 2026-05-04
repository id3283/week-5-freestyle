public class InstancesDemo {

    public static void main(String[] args) {
        Student student1 = new Student("Ahmad", 1);
        Student student2 = new Student("Zo", 26);



        // This will make student2 reference the same object as student1
        // What happens to the object that student2 used to point to?
        // It goes in the garbage.  You no longer have a pointer to it, you can't access it.
//        student2 = student1;

        System.out.println();

        student2.setName("Ahmad");

        System.out.println();
    }
}
