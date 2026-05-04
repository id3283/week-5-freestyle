public class Student {
    private String name;
    private int commits;

    public static String institution = "YUU";

    public Student(String name, int commits) {
        this.name = name;
        this.commits = commits;
    }

    public Student() {
    }


    // Method below cannot be static.  Why?  Because it accesses an instance variable and there is no instance...
    // There is no "this" (and there is no spoon)
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
