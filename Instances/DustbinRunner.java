class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin1 = new Dustbin(
            "CleanMax", "Plastic", 30.0, "Blue", true, true, "Round", 
            50.0, 35.0, 2, "Indoor", "Swing Lid", true, false, true, 
            2, "EcoManufacturers", 9876543210L, "support@cleanmax.com", "India"
        );

        Dustbin dustbin2 = new Dustbin(
            "TidyBin", "Metal", 50.0, "Silver", true, false, "Rectangular", 
            70.0, 40.0, 5, "Outdoor", "Push Lid", false, true, true, 
            5, "SteelCorp", 1234567890L, "help@tidybin.com", "USA"
        );

        Dustbin dustbin3 = new Dustbin(
            "EcoWaste", "Recycled Plastic", 20.0, "Green", false, true, "Square", 
            40.0, 30.0, 1, "Kitchen", "Open Top", false, false, false, 
            3, "EcoFriendly Inc.", 1122334455L, "contact@ecowaste.com", "Germany"
        );
    }
}