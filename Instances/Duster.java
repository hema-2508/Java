class Duster {
    String brand;
    String material;
    String color;
    double length;
    double width;
    double height;
    double weight;
    boolean isReusable;
    boolean isEcoFriendly;
    int durabilityYears;
    int cost;
    String usageType;
    String surfaceCompatibility;
    String manufacturer;
    String originCountry;
    int originYear;
    long annualSales;
    long annualRevenue;
    long customerSupportNumber;
    String customerSupportEmail;

    public Duster(String brand, String material, String color, double length, double width, double height, 
                  double weight, boolean isReusable, boolean isEcoFriendly, int durabilityYears, int cost, 
                  String usageType, String surfaceCompatibility, String manufacturer, String originCountry, 
                  int originYear, long annualSales, long annualRevenue, long customerSupportNumber, 
                  String customerSupportEmail) {
        
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.isReusable = isReusable;
        this.isEcoFriendly = isEcoFriendly;
        this.durabilityYears = durabilityYears;
        this.cost = cost;
        this.usageType = usageType;
        this.surfaceCompatibility = surfaceCompatibility;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.originYear = originYear;
        this.annualSales = annualSales;
        this.annualRevenue = annualRevenue;
        this.customerSupportNumber = customerSupportNumber;
        this.customerSupportEmail = customerSupportEmail;

        System.out.println("Duster Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Dimensions (LxWxH): " + length + "cm x " + width + "cm x " + height + "cm");
        System.out.println("Weight: " + weight + "g");
        System.out.println("Reusable: " + isReusable);
        System.out.println("Eco-Friendly: " + isEcoFriendly);
        System.out.println("Durability: " + durabilityYears + " years");
        System.out.println("Cost: ₹" + cost);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Surface Compatibility: " + surfaceCompatibility);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Origin Year: " + originYear);
        System.out.println("Annual Sales: " + annualSales);
        System.out.println("Annual Revenue: ₹" + annualRevenue);
        System.out.println("Customer Support Number: " + customerSupportNumber);
        System.out.println("Customer Support Email: " + customerSupportEmail);
        
    }
}