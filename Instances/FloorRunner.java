class FloorRunner {
    public static void main(String... args) {
        Floor floor = new Floor();
        System.out.println("Color = " + floor.color);
        System.out.println("Pattern = " + floor.pattern);
        System.out.println("length = " + floor.length);
        System.out.println("Is water proof = " + floor.waterProof);

        floor.color = "Blue";
        floor.pattern = "Large";
        floor.length = 50;
        floor.waterProof = true;

        System.out.println("---Updated values---");
        System.out.println("color = " + floor.color);
        System.out.println("pattern = " + floor.pattern);
        System.out.println("length = " + floor.length);
        System.out.println("waterProof = " + floor.waterProof);
    }
}