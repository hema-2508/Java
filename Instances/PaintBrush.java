class PaintBrush {
    String brand;
    String brushType;
    double brushSize;
    String bristleMaterial;
    String handleMaterial;
    String color;
    int price;
    boolean isWaterproof;
    boolean isWashable;
    String suitableFor;
    double weight;
    String usageType;
    int durabilityInMonths;
    boolean hasGrip;
    String countryOfOrigin;
    String manufacturer;
    long customerSupportNumber;
    String customerSupportEmail;
    String availableInStores;
    boolean ecoFriendly;

    public PaintBrush(String brand, String brushType, double brushSize, String bristleMaterial, String handleMaterial,
                      String color, int price, boolean isWaterproof, boolean isWashable, String suitableFor, 
                      double weight, String usageType, int durabilityInMonths, boolean hasGrip, 
                      String countryOfOrigin, String manufacturer, long customerSupportNumber, 
                      String customerSupportEmail, String availableInStores, boolean ecoFriendly) {
        this.brand = brand;
        this.brushType = brushType;
        this.brushSize = brushSize;
        this.bristleMaterial = bristleMaterial;
        this.handleMaterial = handleMaterial;
        this.color = color;
        this.price = price;
        this.isWaterproof = isWaterproof;
        this.isWashable = isWashable;
        this.suitableFor = suitableFor;
        this.weight = weight;
        this.usageType = usageType;
        this.durabilityInMonths = durabilityInMonths;
        this.hasGrip = hasGrip;
        this.countryOfOrigin = countryOfOrigin;
        this.manufacturer = manufacturer;
        this.customerSupportNumber = customerSupportNumber;
        this.customerSupportEmail = customerSupportEmail;
        this.availableInStores = availableInStores;
        this.ecoFriendly = ecoFriendly;

        System.out.println("Brand: " + brand);
        System.out.println("Brush Type: " + brushType);
        System.out.println("Brush Size: " + brushSize + " mm");
        System.out.println("Bristle Material: " + bristleMaterial);
        System.out.println("Handle Material: " + handleMaterial);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Washable: " + isWashable);
        System.out.println("Suitable For: " + suitableFor);
        System.out.println("Weight: " + weight + " g");
        System.out.println("Usage Type: " + usageType);
        System.out.println("Durability: " + durabilityInMonths + " months");
        System.out.println("Has Grip: " + hasGrip);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Customer Support Number: " + customerSupportNumber);
        System.out.println("Customer Support Email: " + customerSupportEmail);
        System.out.println("Available in Stores: " + availableInStores);
        System.out.println("Eco-Friendly: " + ecoFriendly);
    }
}