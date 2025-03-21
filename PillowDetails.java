public class PillowDetails {
    public static void main(String[] args) {
        // Initial values
        byte softnessLevel = 8;
        short pillowsInPacket = 50;
        int pillowPrice = 999;
        long yearlySales = 100000L;
        float pillowWeight = 500.5f;
        double pillowLength = 60.25;
        char sizeCode = 'L';
        boolean isWashable = true;
        String pillowBrand = "ComfyCloud";

        // Print initial pillow details
        System.out.println("Initial Pillow Details:");
        System.out.println("Brand: " + pillowBrand);
        System.out.println("Softness Level: " + softnessLevel + "/10");
        System.out.println("Pillows in a Packet: " + pillowsInPacket);
        System.out.println("Price: Rs. " + pillowPrice);
        System.out.println("Total Pillows Sold This Year: " + yearlySales);
        System.out.println("Weight of One Pillow: " + pillowWeight + " grams");
        System.out.println("Length of One Pillow: " + pillowLength + " cm");
        System.out.println("Size Code: " + sizeCode);
        System.out.println("Is it Washable? " + isWashable);

        // Re-initialize variables with new values
        softnessLevel = 10;
        pillowsInPacket = 30;
        pillowPrice = 1499;
        yearlySales = 200000L;
        pillowWeight = 450.0f;
        pillowLength = 55.5;
        sizeCode = 'M';
        isWashable = false;
        pillowBrand = "DreamRest";

        // Print updated pillow details
        System.out.println("\nUpdated Pillow Details:");
        System.out.println("Brand: " + pillowBrand);
        System.out.println("Softness Level: " + softnessLevel + "/10");
        System.out.println("Pillows in a Packet: " + pillowsInPacket);
        System.out.println("Price: Rs. " + pillowPrice);
        System.out.println("Total Pillows Sold This Year: " + yearlySales);
        System.out.println("Weight of One Pillow: " + pillowWeight + " grams");
        System.out.println("Length of One Pillow: " + pillowLength + " cm");
        System.out.println("Size Code: " + sizeCode);
        System.out.println("Is it Washable? " + isWashable);
    }
}

