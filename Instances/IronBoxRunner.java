class IronBoxRunner {
    public static void main(String... args) {
        IronBox ironbox = new IronBox();
        System.out.println("Heat = " + ironbox.heat);
        System.out.println("Plate = " + ironbox.plate);
        System.out.println("Steam = " + ironbox.steam);
        System.out.println("Temp Control = " + ironbox.tempControl);

        ironbox.heat = 1500;
        ironbox.plate = "Ceramic";
        ironbox.steam = true;
        ironbox.tempControl = "Adjustable";

        System.out.println("---Updated values---");
        System.out.println("Heat = " + ironbox.heat);
        System.out.println("Plate = " + ironbox.plate);
        System.out.println("Steam = " + ironbox.steam);
        System.out.println("Temp Control = " + ironbox.tempControl);
    }
}