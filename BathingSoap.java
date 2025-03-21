public class BathingSoap {
    public static void main(String[] args) {
        // Initial values
        byte soapRating = 8;
        short soapsInBox = 100;
        int soapPricePaise = 5000;
        long yearlySales = 1000000000L;
        float soapWeight = 125.5f;
        double soapLength = 9.75;
        char soapGrade = 'A';
        boolean isAvailable = true;
        String soapBrand = "FreshGlow";

        System.out.println("Initial Soap Details:");
        System.out.println("Brand: " + soapBrand);
        System.out.println("Rating: " + soapRating + "/10");
        System.out.println("Soaps in a box: " + soapsInBox);
        System.out.println("Price: " + (soapPricePaise / 100.0) + " rupees");
        System.out.println("Total sales this year: " + yearlySales);
        System.out.println("Weight: " + soapWeight + " grams");
        System.out.println("Length: " + soapLength + " cm");
        System.out.println("Grade: " + soapGrade);
        System.out.println("Is available: " + isAvailable);

        // Re-initialize variables with new values
        soapRating = 10;
        soapsInBox = 200;
        soapPricePaise = 7500;
        yearlySales = 2000000000L;
        soapWeight = 150.0f;
        soapLength = 10.5;
        soapGrade = 'B';
        isAvailable = false;
        soapBrand = "GlowPure";

        System.out.println("\nUpdated Soap Details:");
        System.out.println("Brand: " + soapBrand);
        System.out.println("Rating: " + soapRating + "/10");
        System.out.println("Soaps in a box: " + soapsInBox);
        System.out.println("Price: " + (soapPricePaise / 100.0) + " rupees");
        System.out.println("Total sales this year: " + yearlySales);
        System.out.println("Weight: " + soapWeight + " grams");
        System.out.println("Length: " + soapLength + " cm");
        System.out.println("Grade: " + soapGrade);
        System.out.println("Is available: " + isAvailable);
    }
}