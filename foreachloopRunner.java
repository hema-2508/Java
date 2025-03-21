public class foreachloopRunner {
    public static void main(String[] args) {

        
        String[] coins = {"1 Rupee", "2 Rupees", "5 Rupees", "10 Rupees", "50 Paise"};

        // Note array
        String[] notes = {"10 Rupees", "20 Rupees", "50 Rupees", "100 Rupees", "200 Rupees"};

        // Watch array
        String[] watches = {"Digital Watch", "Analog Watch", "Smart Watch", "Sports Watch", "Classic Watch"};

        // Camera array
        String[] cameras = {"DSLR Camera", "Mirrorless Camera", "Action Camera", "Polaroid Camera", "CCTV Camera"};

        // Game array
        String[] games = {"Cricket", "Football", "Chess", "Video Game", "Badminton"};

        // Bag array
        String[] bags = {"School Bag", "Laptop Bag", "Travel Bag", "Hand Bag", "Duffel Bag"};

        // Pot array
        String[] pots = {"Clay Pot", "Flower Pot", "Tea Pot", "Pressure Cooker Pot", "Soup Pot"};

        // Router array
        String[] routers = {"WiFi Router", "DSL Router", "Cable Router", "Wireless Router", "Gaming Router"};

        // Print all arrays using for-each loop
        System.out.println("Coins:");
        for (String coin : coins) {
            System.out.println(coin);
        }

        System.out.println("\nNotes:");
        for (String note : notes) {
            System.out.println(note);
        }

        System.out.println("\nWatches:");
        for (String watch : watches) {
            System.out.println(watch);
        }

        System.out.println("\nCameras:");
        for (String camera : cameras) {
            System.out.println(camera);
        }

        System.out.println("\nGames:");
        for (String game : games) {
            System.out.println(game);
        }

        System.out.println("\nBags:");
        for (String bag : bags) {
            System.out.println(bag);
        }

        System.out.println("\nPots:");
        for (String pot : pots) {
            System.out.println(pot);
        }

        System.out.println("\nRouters:");
        for (String router : routers) {
            System.out.println(router);
        }
    }
}
