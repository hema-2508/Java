class ShirtRunner {
    public static void main(String... args) {
        Shirt shirt = new Shirt();
        System.out.println("Material = " + shirt.material);
        System.out.println("Neckline = " + shirt.neckline);
        System.out.println("Sleeve Type = " + shirt.sleeve_type);
        System.out.println("Style = " + shirt.style);

        shirt.material = "Linen";
        shirt.neckline = "V-Neck";
        shirt.sleeve_type = "Half";
        shirt.style = "Regular Fit";

        System.out.println("---Updated values---");
        System.out.println("Material = " + shirt.material);
        System.out.println("Neckline = " + shirt.neckline);
        System.out.println("Sleeve Type = " + shirt.sleeve_type);
        System.out.println("Style = " + shirt.style);
    }
}