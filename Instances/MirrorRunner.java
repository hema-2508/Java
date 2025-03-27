class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror1 = new Mirror(
            "Wall Mirror", "Wood", "Rectangle", "IKEA", 120.0, 60.0, 5.0, 
            "Wall-mounted", "Tempered Glass", true, true, true, 
            "LED Backlight", 10.5, 5, "Sweden", 2020, "IKEA Ltd.", 
            1234567890L, "support@ikea.com"
        );

        Mirror mirror2 = new Mirror(
            "Makeup Mirror", "Plastic", "Round", "Philips", 30.0, 30.0, 3.0, 
            "Tabletop", "Acrylic", false, false, true, 
            "No Lighting", 2.5, 2, "Netherlands", 2022, "Philips Inc.", 
            9876543210L, "help@philips.com"
        );

        Mirror mirror3 = new Mirror(
            "Full-Length Mirror", "Metal", "Oval", "HomeCentre", 180.0, 70.0, 7.0, 
            "Freestanding", "Silver Coated Glass", true, true, false, 
            "LED Strip", 15.0, 3, "India", 2021, "HomeCentre Pvt. Ltd.", 
            9998887776L, "care@homecentre.com"
        );
    }
}
