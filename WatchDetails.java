public class WatchDetails {
    public static void main(String[] args) {
        // Initial values
        byte starRating = 4;
        short stockQuantity = 320;
        int watchPrice = 2999;
        long yearlySales = 500000L;
        float watchWeight = 150.5f;
        double dialDiameter = 4.25;
        char sizeCode = 'M';
        boolean isWaterproof = true;
        String watchBrand = "TimeMaster";

        System.out.println("Initial Watch Details:");
        System.out.println("Brand: " + watchBrand);
        System.out.println("Star Rating: " + starRating + " out of 5 stars");
        System.out.println("Available Stock: " + stockQuantity);
        System.out.println("Price: Rs. " + watchPrice);
        System.out.println("Total Sales This Year: " + yearlySales);
        System.out.println("Weight: " + watchWeight + " grams");
        System.out.println("Dial Diameter: " + dialDiameter + " cm");
        System.out.println("Size Code: " + sizeCode);
        System.out.println("Waterproof: " + isWaterproof);

        // Re-initializing variables with new values
        starRating = 5;
        stockQuantity = 150;
        watchPrice = 3999;
        yearlySales = 750000L;
        watchWeight = 135.75f;
        dialDiameter = 5.5;
        sizeCode = 'L';
        isWaterproof = false;
        watchBrand = "EliteChrono";

        System.out.println("\nUpdated Watch Details:");
        System.out.println("Brand: " + watchBrand);
        System.out.println("Star Rating: " + starRating + " out of 5 stars");
        System.out.println("Available Stock: " + stockQuantity);
        System.out.println("Price: Rs. " + watchPrice);
        System.out.println("Total Sales This Year: " + yearlySales);
        System.out.println("Weight: " + watchWeight + " grams");
        System.out.println("Dial Diameter: " + dialDiameter + " cm");
        System.out.println("Size Code: " + sizeCode);
        System.out.println("Waterproof: " + isWaterproof);
    }
}