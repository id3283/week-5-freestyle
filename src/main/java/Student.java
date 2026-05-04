public class Student {
    // These are instance variables.  So called because every instance gets its own copy of them.
    // It wouldn't be very useful if every student object we create is named Ahmad.
    // (and, if every student's name was Ahmad, I'd screw up the pronunciation of everyone!)
    private String name;
    private int commits;

    // Static field is the same for all instances.
    // You can think of it kinda like a class variable.  If you change it, you change it for all instances of the class.
    // So, what's it good for?  It's only useful when all instance should have the same value.
    // Every student has their own name, but they all study at the same institution.
    public static String institution = "YUU";

    public Student(String name, int commits) {
        this.name = name;
        this.commits = commits;
    }

    public Student() {
    }

    // Method below cannot be static.  Why?  Because it accesses an instance variable and there is no instance...
    // There is no "this" which is how we access the particular instance we're "in" (and there is no spoon)
    public void introduce() {
        System.out.println("Hi, my name is " + this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommits(int commits) {
        this.commits = commits;
    }

    public String getName() {
        return name;
    }

    public int getCommits() {
        return commits;
    }
}
