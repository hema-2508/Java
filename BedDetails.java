public class BedDetails {
    public static void main(String[] args) {
        // Initial values
        byte comfortLevel = 9;
        short bedsInStore = 150;
        int bedPrice = 25000;
        long yearlyBedSales = 50000L;
        float bedWeight = 75.5f;
        double bedLength = 200.75;
        char sizeCode = 'K';
        boolean isFoldable = true;
        String bedBrand = "SleepWell";

        // Print initial bed details
        System.out.println("Initial Bed Details:");
        System.out.println("Brand: " + bedBrand);
        System.out.println("Comfort Level: " + comfortLevel + "/10");
        System.out.println("Beds in Store: " + bedsInStore);
        System.out.println("Price of One Bed: Rs. " + bedPrice);
        System.out.println("Beds Sold This Year: " + yearlyBedSales);
        System.out.println("Weight of the Bed: " + bedWeight + " kg");
        System.out.println("Length of the Bed: " + bedLength + " cm");
        System.out.println("Size Code: " + sizeCode);
        System.out.println("Is Foldable: " + isFoldable);

        // Re-initialize variables with new values
        comfortLevel = 7;
        bedsInStore = 80;
        bedPrice = 30000;
        yearlyBedSales = 75000L;
        bedWeight = 85.0f;
        bedLength = 210.5;
        sizeCode = 'Q';  // Q for Queen size
        isFoldable = false;
        bedBrand = "DreamRest";

        // Print updated bed details
        System.out.println("\nUpdated Bed Details:");
        System.out.println("Brand: " + bedBrand);
        System.out.println("Comfort Level: " + comfortLevel + "/10");
        System.out.println("Beds in Store: " + bedsInStore);
        System.out.println("Price of One Bed: Rs. " + bedPrice);
        System.out.println("Beds Sold This Year: " + yearlyBedSales);
        System.out.println("Weight of the Bed: " + bedWeight + " kg");
        System.out.println("Length of the Bed: " + bedLength + " cm");
        System.out.println("Size Code: " + sizeCode);
        System.out.println("Is Foldable: " + isFoldable);
    }
}
