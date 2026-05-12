package assets;

public class Stock extends Asset{
    private int numberOfShares;
    private  double pricePerShare;

    public Stock(int numberOfShares, double pricePerShare) {
        super("stock");
        this.numberOfShares = numberOfShares;
        this.pricePerShare = pricePerShare;
    }

    @Override
    public double getValue() {
        return this.numberOfShares * this.pricePerShare;
    }
}
