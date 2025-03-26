class HairRunner {
    public static void main(String... args) {
        Hair hair = new Hair();
        System.out.println("Type = " + hair.type);
        System.out.println("Shade = " + hair.shade);
        System.out.println("Volume = " + hair.volume);
        System.out.println("Speed = " + hair.speed);

        hair.type = "Straight";
        hair.shade = "Black";
        hair.volume = "Thick";
        hair.speed = 1.5;

        System.out.println("---Updated values---");
        System.out.println("Type = " + hair.type);
        System.out.println("Shade = " + hair.shade);
        System.out.println("Volume = " + hair.volume);
        System.out.println("Speed = " + hair.speed);
    }
}