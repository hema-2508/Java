public class RingDetails {
    public static void main(String[] args) {
      
        byte shineLevel = 10;
        short ringsInShop = 250;
        int ringPrice = 15000;
        long yearlyRingSales = 500000L;
        float ringWeight = 7.5f;
        double ringDiameter = 18.75;
        char sizeCode = 'M';
        boolean isGold = true;
        String ringBrand = "GoldShine";

        
        System.out.println("Initial Ring Details:");
        System.out.println("Brand: " + ringBrand);
        System.out.println("Shine Level: " + shineLevel + "/10");
        System.out.println("Rings in Shop: " + ringsInShop);
        System.out.println("Price of One Ring: Rs. " + ringPrice);
        System.out.println("Rings Sold This Year: " + yearlyRingSales);
        System.out.println("Weight of the Ring: " + ringWeight + " grams");
        System.out.println("Diameter of the Ring: " + ringDiameter + " mm");
        System.out.println("Ring Size Code: " + sizeCode);
        System.out.println("Is it made of Gold? " + isGold);

        
        shineLevel = 8;
        ringsInShop = 150;
        ringPrice = 12000;
        yearlyRingSales = 600000L;
        ringWeight = 6.25f;
        ringDiameter = 17.50;
        sizeCode = 'S'; 
        isGold = false;
        ringBrand = "SilverGleam";

        System.out.println("\nUpdated Ring Details:");
        System.out.println("Brand: " + ringBrand);
        System.out.println("Shine Level: " + shineLevel + "/10");
        System.out.println("Rings in Shop: " + ringsInShop);
        System.out.println("Price of One Ring: Rs. " + ringPrice);
        System.out.println("Rings Sold This Year: " + yearlyRingSales);
        System.out.println("Weight of the Ring: " + ringWeight + " grams");
        System.out.println("Diameter of the Ring: " + ringDiameter + " mm");
        System.out.println("Ring Size Code: " + sizeCode);
        System.out.println("Is it made of Gold? " + isGold);
    }
}

