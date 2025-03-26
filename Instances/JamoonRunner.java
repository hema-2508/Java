class JamoonRunner {
    public static void main(String... args) {
        Jamoon jamoon = new Jamoon();
        System.out.println("Form = " + jamoon.form);
        System.out.println("Shade = " + jamoon.shade);
        System.out.println("Flavor = " + jamoon.flavor);
        System.out.println("Nutrients = " + jamoon.nutrients);

        jamoon.form = "Round";
        jamoon.shade = "Purple";
        jamoon.flavor = "Sweet";
        jamoon.nutrients = "High in Fiber";

        System.out.println("---Updated values---");
        System.out.println("Form = " + jamoon.form);
        System.out.println("Shade = " + jamoon.shade);
        System.out.println("Flavor = " + jamoon.flavor);
        System.out.println("Nutrients = " + jamoon.nutrients);
    }
}