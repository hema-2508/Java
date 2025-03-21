public class forloopRunner {
    public static void main(String[] args) {

        // Shirt array
        String[] shirts = {"Red Shirt", "Blue Shirt", "Green Shirt", "Black Shirt", "White Shirt"};

        // Clip array
        String[] clips = {"Small Clip", "Big Clip", "Color Clip", "Metal Clip", "Plastic Clip"};

        // Paint array
        String[] paints = {"Red Paint", "Blue Paint", "Green Paint", "Yellow Paint", "Black Paint"};

        // Wire array
        String[] wires = {"Copper Wire", "Fiber Wire", "Steel Wire", "Plastic Wire", "Iron Wire"};

        // Wall array
        String[] walls = {"Brick Wall", "Concrete Wall", "Wooden Wall", "Glass Wall", "Stone Wall"};

        // Paper array
        String[] papers = {"A4 Paper", "Chart Paper", "Tissue Paper", "Glossy Paper", "Bond Paper"};

        // Poster array
        String[] posters = {"Movie Poster", "Educational Poster", "Advertisement Poster", "Event Poster", "Art Poster"};

        // Wallet array
        String[] wallets = {"Leather Wallet", "Fabric Wallet", "Travel Wallet", "Coin Wallet", "Card Wallet"};

        // Print all arrays
        System.out.println("Shirts:");
        for (int i = 0; i < shirts.length; i++) {
            System.out.println(shirts[i]);
        }

        System.out.println("\nClips:");
        for (int i = 0; i < clips.length; i++) {
            System.out.println(clips[i]);
        }

        System.out.println("\nPaints:");
        for (int i = 0; i < paints.length; i++) {
            System.out.println(paints[i]);
        }

        System.out.println("\nWires:");
        for (int i = 0; i < wires.length; i++) {
            System.out.println(wires[i]);
        }

        System.out.println("\nWalls:");
        for (int i = 0; i < walls.length; i++) {
            System.out.println(walls[i]);
        }

        System.out.println("\nPapers:");
        for (int i = 0; i < papers.length; i++) {
            System.out.println(papers[i]);
        }

        System.out.println("\nPosters:");
        for (int i = 0; i < posters.length; i++) {
            System.out.println(posters[i]);
        }

        System.out.println("\nWallets:");
        for (int i = 0; i < wallets.length; i++) {
            System.out.println(wallets[i]);
        }
    }
}
