class DusterRunner {
    public static void main(String[] args) {
        Duster duster1 = new Duster(
            "Camlin", "Plastic", "Blue", 15.0, 5.0, 3.0, 50.0, true, true, 
            5, 80, "Whiteboard", "Glass & Whiteboards", "Camlin Pvt Ltd", "India", 
            1995, 1000000, 50000000, 9876543210L, "support@camlin.com"
        );

        Duster duster2 = new Duster(
            "Staedtler", "Wood", "Black", 18.0, 6.0, 4.0, 75.0, true, false, 
            8, 120, "Blackboard", "Chalkboards", "Staedtler Germany", "Germany", 
            1985, 750000, 80000000, 9988776655L, "help@staedtler.com"
        );

        Duster duster3 = new Duster(
            "Faber-Castell", "Foam", "Green", 12.0, 4.5, 2.5, 40.0, false, true, 
            3, 60, "Multipurpose", "All Surfaces", "Faber-Castell Intl", "USA", 
            2000, 500000, 40000000, 1122334455L, "contact@fabercastell.com"
        );
    }
}