class HangerRunner {
    public static void main(String... values) {
        Hanger hanger = new Hanger();
        System.out.println("Type = " + hanger.type);
        System.out.println("Form = " + hanger.form);
        System.out.println("Rotates = " + hanger.rotates);
        System.out.println("Length = " + hanger.length);

        hanger.type = "Plastic";
        hanger.form = "Flat";
        hanger.rotates = false;
        hanger.length = "Medium";

        System.out.println("---Updated values---");
        System.out.println("Type = " + hanger.type);
        System.out.println("Form = " + hanger.form);
        System.out.println("Rotates = " + hanger.rotates);
        System.out.println("Length = " + hanger.length);
    }
}