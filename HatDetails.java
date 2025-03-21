public class HatDetails {
    public static void main(String[] args) {
        
        byte styleRating = 9;
        short hatsInStore = 120;
        int hatPrice = 500;
        long yearlyHatSales = 100000L;
        float hatWeight = 150.5f;
        double hatDiameter = 30.75;
        char sizeCode = 'S';
        boolean isWashable = true;
        String hatBrand = "CoolCap";

        
        System.out.println("Initial Hat Details:");
        System.out.println("Brand: " + hatBrand);
        System.out.println("Style Rating: " + styleRating + "/10");
        System.out.println("Hats in Store: " + hatsInStore);
        System.out.println("Price of One Hat: Rs. " + hatPrice);
        System.out.println("Hats Sold This Year: " + yearlyHatSales);
        System.out.println("Weight of the Hat: " + hatWeight + " grams");
        System.out.println("Diameter of the Hat: " + hatDiameter + " cm");
        System.out.println("Hat Size Code: " + sizeCode);
        System.out.println("Is it Washable? " + isWashable);

        
        styleRating = 7;
        hatsInStore = 80;
        hatPrice = 750;
        yearlyHatSales = 150000L;
        hatWeight = 130.25f;
        hatDiameter = 32.5;
        sizeCode = 'M'; 
        isWashable = false;
        hatBrand = "SunShield";

        
        System.out.println("\nUpdated Hat Details:");
        System.out.println("Brand: " + hatBrand);
        System.out.println("Style Rating: " + styleRating + "/10");
        System.out.println("Hats in Store: " + hatsInStore);
        System.out.println("Price of One Hat: Rs. " + hatPrice);
        System.out.println("Hats Sold This Year: " + yearlyHatSales);
        System.out.println("Weight of the Hat: " + hatWeight + " grams");
        System.out.println("Diameter of the Hat: " + hatDiameter + " cm");
        System.out.println("Hat Size Code: " + sizeCode);
        System.out.println("Is it Washable? " + isWashable);
    }
}
