package assets;

public class House extends Asset{
    private int squareFootage;

    public House(int squareFootage) {
        super("house");
        this.squareFootage = squareFootage;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    @Override
    public double getValue() {

        return this.squareFootage * 150;
    }
}
