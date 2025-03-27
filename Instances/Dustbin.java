class Dustbin {
    String brand;
    String material;
    double capacity;
    String color;
    boolean hasLid;
    boolean isRecyclable;
    String shape;
    double height;
    double diameter;
    int weight;
    String usageType;
    String openingMechanism;
    boolean hasFootPedal;
    boolean isFireResistant;
    boolean isOdorProof;
    int warrantyYears;
    String manufacturer;
    long customerSupportNumber;
    String customerSupportEmail;
    String countryOfOrigin;

    public Dustbin(String brand, String material, double capacity, String color, boolean hasLid, 
                   boolean isRecyclable, String shape, double height, double diameter, int weight, 
                   String usageType, String openingMechanism, boolean hasFootPedal, boolean isFireResistant, 
                   boolean isOdorProof, int warrantyYears, String manufacturer, long customerSupportNumber, 
                   String customerSupportEmail, String countryOfOrigin) {
        this.brand = brand;
        this.material = material;
        this.capacity = capacity;
        this.color = color;
        this.hasLid = hasLid;
        this.isRecyclable = isRecyclable;
        this.shape = shape;
        this.height = height;
        this.diameter = diameter;
        this.weight = weight;
        this.usageType = usageType;
        this.openingMechanism = openingMechanism;
        this.hasFootPedal = hasFootPedal;
        this.isFireResistant = isFireResistant;
        this.isOdorProof = isOdorProof;
        this.warrantyYears = warrantyYears;
        this.manufacturer = manufacturer;
        this.customerSupportNumber = customerSupportNumber;
        this.customerSupportEmail = customerSupportEmail;
        this.countryOfOrigin = countryOfOrigin;

        System.out.println("Dustbin Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Color: " + color);
        System.out.println("Has Lid: " + hasLid);
        System.out.println("Is Recyclable: " + isRecyclable);
        System.out.println("Shape: " + shape);
        System.out.println("Height: " + height + " cm");
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Usage Type: " + usageType);
        System.out.println("Opening Mechanism: " + openingMechanism);
        System.out.println("Has Foot Pedal: " + hasFootPedal);
        System.out.println("Is Fire Resistant: " + isFireResistant);
        System.out.println("Is Odor Proof: " + isOdorProof);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Customer Support Number: " + customerSupportNumber);
        System.out.println("Customer Support Email: " + customerSupportEmail);
        System.out.println("Country of Origin: " + countryOfOrigin);
        
    }
}