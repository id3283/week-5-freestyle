public class Student {
    private String name;
    private int commits;

    public Student(String name, int commits) {
        this.name = name;
        this.commits = commits;
    }

    public Student() {
    }

    public void introduce(String name) {
        System.out.println(name);
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
