class BedRunner {
    public static void main(String... args) {
        Bed bed = new Bed();
        System.out.println("Material = " + bed.material);
        System.out.println("Color = " + bed.color);
        System.out.println("Type = " + bed.type);
        System.out.println("Width = " + bed.width);

        bed.material = "Metal";
        bed.color = "Black";
        bed.type = "King";
        bed.width = 5;

        System.out.println("---Updated values---");
        System.out.println("Material = " + bed.material);
        System.out.println("Color = " + bed.color);
        System.out.println("Type = " + bed.type);
        System.out.println("Width = " + bed.width);
    }
}