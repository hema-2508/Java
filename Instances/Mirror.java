class Mirror {
    String mirrorType;
    String frameMaterial;
    String shape;
    String brand;
    double height;
    double width;
    double thickness;
    String mountingType;
    String glassType;
    boolean antiFog;
    boolean shatterproof;
    boolean scratchResistant;
    String lightingType;
    double weight;
    int warrantyYears;
    String placeOfManufacture;
    int manufactureYear;
    String manufacturer;
    long customerSupportNumber;
    String customerSupportEmail;

    public Mirror(String mirrorType, String frameMaterial, String shape, String brand, 
                  double height, double width, double thickness, String mountingType, 
                  String glassType, boolean antiFog, boolean shatterproof, boolean scratchResistant, 
                  String lightingType, double weight, int warrantyYears, String placeOfManufacture, 
                  int manufactureYear, String manufacturer, long customerSupportNumber, String customerSupportEmail) {
        this.mirrorType = mirrorType;
        this.frameMaterial = frameMaterial;
        this.shape = shape;
        this.brand = brand;
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.mountingType = mountingType;
        this.glassType = glassType;
        this.antiFog = antiFog;
        this.shatterproof = shatterproof;
        this.scratchResistant = scratchResistant;
        this.lightingType = lightingType;
        this.weight = weight;
        this.warrantyYears = warrantyYears;
        this.placeOfManufacture = placeOfManufacture;
        this.manufactureYear = manufactureYear;
        this.manufacturer = manufacturer;
        this.customerSupportNumber = customerSupportNumber;
        this.customerSupportEmail = customerSupportEmail;

        System.out.println("Mirror Type: " + mirrorType);
        System.out.println("Frame Material: " + frameMaterial);
        System.out.println("Shape: " + shape);
        System.out.println("Brand: " + brand);
        System.out.println("Height: " + height + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Thickness: " + thickness + " mm");
        System.out.println("Mounting Type: " + mountingType);
        System.out.println("Glass Type: " + glassType);
        System.out.println("Anti-Fog: " + antiFog);
        System.out.println("Shatterproof: " + shatterproof);
        System.out.println("Scratch Resistant: " + scratchResistant);
        System.out.println("Lighting Type: " + lightingType);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Manufacture Place: " + placeOfManufacture);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Customer Support Number: " + customerSupportNumber);
        System.out.println("Customer Support Email: " + customerSupportEmail);
   
    }
}
