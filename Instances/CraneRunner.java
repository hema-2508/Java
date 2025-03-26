class CraneRunner {
    public static void main(String... args) {
        Crane crane = new Crane();
        System.out.println("Capacity = " + crane.capacity);
        System.out.println("Length = " + crane.length);
        System.out.println("Type = " + crane.type);
        System.out.println("Mechanism = " + crane.mechanism);

        crane.capacity = 10000;
        crane.length = 50;
        crane.type = "Mobile";
        crane.mechanism = "Hydraulic";

        System.out.println("---Updated values---");
        System.out.println("Capacity = " + crane.capacity);
        System.out.println("Length = " + crane.length);
        System.out.println("Type = " + crane.type);
        System.out.println("Mechanism = " + crane.mechanism);
    }
}