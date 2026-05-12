package assets;

public class Island extends Asset {
    private int squareMileage;

    public Island(String description, int squareMileage) {
        super(description);
        this.squareMileage = squareMileage;
    }



    @Override
    public double getValue() {
        return this.squareMileage * 10_000;
    }
}
