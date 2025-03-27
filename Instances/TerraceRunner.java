class TerraceRunner {
    public static void main(String... args) {
        Terrace terrace = new Terrace();
        System.out.println("Roofing type = " + terrace.roofing);
        System.out.println("Maximum load = " + terrace.maxLoad);
        System.out.println("Is it waterprrof = " + terrace.waterProof);
        System.out.println("which material = " + terrace.material);

        terrace.roofing = "Yes";
        terrace.maxLoad = 50;
        terrace.waterProof = true;
        terrace.material = "cement";

        System.out.println("---Updated values---");
        System.out.println("Roofing type =  " + terrace.roofing);
        System.out.println("Maximum load =" + terrace.maxLoad);
        System.out.println("Is it waterproof = " + terrace.waterProof);
        System.out.println("which material =  " + terrace.material);
    }
}