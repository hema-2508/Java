class AnchorRunner {
    public static void main(String... args) {
        Anchor anchor = new Anchor();
        System.out.println("Type = " + anchor.type);
        System.out.println("Strength = " + anchor.strength);
        System.out.println("Mass = " + anchor.mass);
        System.out.println("Shape = " + anchor.shape);

        anchor.type = "Steel";
        anchor.strength = 250;
        anchor.mass = 12;
        anchor.shape = "Claw";

        System.out.println("---Updated values---");
        System.out.println("Type = " + anchor.type);
        System.out.println("Strength = " + anchor.strength);
        System.out.println("Mass = " + anchor.mass);
        System.out.println("Shape = " + anchor.shape);
    }
}