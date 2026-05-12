package assets;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Island i = new Island("Scottish Island", 100);
        Asset h = new House(3500);
        Yacht y = new Yacht("sailboat", 36);

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(i);
        assets.add(h);
        assets.add(y);

        double totalValue = 0;
        for(Asset a : assets) {
            System.out.println("Description: " + a.getDescription() + " Value: " + a.getValue());

            if (a instanceof Yacht) {
                Yacht boat = (Yacht) a;
                System.out.println("Boat Length: " + boat.getLength());
            }


            totalValue = totalValue +  a.getValue();
        }



//
//        if(h instanceof House) {
//            House house = (House)h;
//            house.getSquareFootage();
//        }
//
//        Asset goog = new Stock(10, 382);
//
//        assets.add(h);
//        assets.add(goog);
//
//        double netWorth = 0;
//        for (Asset a : assets) {
//            netWorth += a.getValue();
//        }
//
//        System.out.println("Congrats, you're wealth: " + netWorth);
    }
}
