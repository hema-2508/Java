class SirenRunner {
    public static void main(String... args) {
        Siren siren = new Siren();
        System.out.println("Frequency = " + siren.frequency);
        System.out.println("Power = " + siren.power);
        System.out.println("Volume = " + siren.volume);
        System.out.println("Use = " + siren.use);

        siren.frequency = 1200;
        siren.power = "Electric";
        siren.volume = 120;
        siren.use = "Emergency";

        System.out.println("---Updated values---");
        System.out.println("Frequency = " + siren.frequency);
        System.out.println("Power = " + siren.power);
        System.out.println("Volume = " + siren.volume);
        System.out.println("Use = " + siren.use);
    }
}