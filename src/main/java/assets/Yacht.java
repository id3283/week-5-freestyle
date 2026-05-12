package assets;

public class Yacht extends Asset {
    private int length;

    public Yacht(String description, int length) {
        super(description);
        this.length = length;
    }

    public double getValue() {
        return 5_000 * this.length;
    }

    public int getLength() {
        return length;
    }
}
