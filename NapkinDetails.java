public class NapkinDetails {
    public static void main(String[] args) {
        // Initial values
        byte softnessLevel = 9;
        short napkinsInPacket = 100;
        int priceInPaise = 2500;
        long yearlySales = 2000000L;
        float napkinWeight = 15.5f;
        double napkinLength = 30.75;
        char sizeCode = 'L';
        boolean isBiodegradable = true;
        String napkinBrand = "SoftTouch";

        // Print initial details
        System.out.println("Initial Napkin Details:");
        System.out.println("Brand: " + napkinBrand);
        System.out.println("Softness Level: " + softnessLevel + "/10");
        System.out.println("Napkins in a Packet: " + napkinsInPacket);
        System.out.println("Price: " + (priceInPaise / 100.0) + " Rupees");
        System.out.println("Total Napkins Sold This Year: " + yearlySales);
        System.out.println("Weight of One Napkin: " + napkinWeight + " grams");
        System.out.println("Length of One Napkin: " + napkinLength + " cm");
        System.out.println("Size Code: " + sizeCode);
        System.out.println("Is Biodegradable: " + isBiodegradable);

        // Re-initialize variables with new values
        softnessLevel = 7;
        napkinsInPacket = 80;
        priceInPaise = 3000;
        yearlySales = 2500000L;
        napkinWeight = 12.75f;
        napkinLength = 28.50;
        sizeCode = 'M';
        isBiodegradable = false;
        napkinBrand = "EcoWipe";

        // Print updated details
        System.out.println("\nUpdated Napkin Details:");
        System.out.println("Brand: " + napkinBrand);
        System.out.println("Softness Level: " + softnessLevel + "/10");
        System.out.println("Napkins in a Packet: " + napkinsInPacket);
        System.out.println("Price: " + (priceInPaise / 100.0) + " Rupees");
        System.out.println("Total Napkins Sold This Year: " + yearlySales);
        System.out.println("Weight of One Napkin: " + napkinWeight + " grams");
        System.out.println("Length of One Napkin: " + napkinLength + " cm");
        System.out.println("Size Code: " + sizeCode);
        System.out.println("Is Biodegradable: " + isBiodegradable);
    }
}
