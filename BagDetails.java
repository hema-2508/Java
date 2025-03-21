public class BagDetails {
    public static void main(String[] args) {
        
        byte numberOfZippers = 3;
        short bagsInStore = 250;
        int bagPrice = 1500;
        long yearlyBagSales = 50000L;
        float bagWeight = 1.25f;
        double bagLength = 45.75;
        char sizeCode = 'M';
        boolean isWaterproof = true;
        String bagBrand = "TravelPro";

        
        System.out.println("Initial Bag Details:");
        System.out.println("Brand: " + bagBrand);
        System.out.println("Number of Zippers: " + numberOfZippers);
        System.out.println("Bags in Store: " + bagsInStore);
        System.out.println("Price of One Bag: Rs. " + bagPrice);
        System.out.println("Bags Sold This Year: " + yearlyBagSales);
        System.out.println("Weight of the Bag: " + bagWeight + " kg");
        System.out.println("Length of the Bag: " + bagLength + " cm");
        System.out.println("Bag Size Code: " + sizeCode);
        System.out.println("Is it Waterproof? " + isWaterproof);

        
        numberOfZippers = 5;
        bagsInStore = 100;
        bagPrice = 2000;
        yearlyBagSales = 75000L;
        bagWeight = 1.75f;
        bagLength = 50.0;
        sizeCode = 'L'; 
        isWaterproof = false;
        bagBrand = "UrbanGear";

        
        System.out.println("\nUpdated Bag Details:");
        System.out.println("Brand: " + bagBrand);
        System.out.println("Number of Zippers: " + numberOfZippers);
        System.out.println("Bags in Store: " + bagsInStore);
        System.out.println("Price of One Bag: Rs. " + bagPrice);
        System.out.println("Bags Sold This Year: " + yearlyBagSales);
        System.out.println("Weight of the Bag: " + bagWeight + " kg");
        System.out.println("Length of the Bag: " + bagLength + " cm");
        System.out.println("Bag Size Code: " + sizeCode);
        System.out.println("Is it Waterproof? " + isWaterproof);
    }
}