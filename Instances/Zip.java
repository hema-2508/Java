class Zip {
    String zipName;
    String brand;
    double size;
    String color;
    String material;
    int cost;
    double weight;
    String type;
    boolean waterproof;
    boolean rustProof;
    int teethCount;
    double length;
    double width;
    long annualSales;
    long annualIncome;
    String originPlace;
    int originYear;
    String founder;
    long custSprtNumber;
    String custSprtMail;

    public Zip(String zipName, String brand, double size, String color, String material, int cost, 
               double weight, String type, boolean waterproof, boolean rustProof, int teethCount, 
               double length, double width, long annualSales, long annualIncome, String originPlace, 
               int originYear, String founder, long custSprtNumber, String custSprtMail) {
        this.zipName = zipName;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.material = material;
        this.cost = cost;
        this.weight = weight;
        this.type = type;
        this.waterproof = waterproof;
        this.rustProof = rustProof;
        this.teethCount = teethCount;
        this.length = length;
        this.width = width;
        this.annualSales = annualSales;
        this.annualIncome = annualIncome;
        this.originPlace = originPlace;
        this.originYear = originYear;
        this.founder = founder;
        this.custSprtNumber = custSprtNumber;
        this.custSprtMail = custSprtMail;

        System.out.println("Zip Name: " + zipName);
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " cm");
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Cost: ₹" + cost);
        System.out.println("Weight: " + weight + " g");
        System.out.println("Type: " + type);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Rust Proof: " + rustProof);
        System.out.println("Teeth Count: " + teethCount);
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Annual Sales: " + annualSales);
        System.out.println("Annual Income: ₹" + annualIncome);
        System.out.println("Origin Place: " + originPlace);
        System.out.println("Origin Year: " + originYear);
        System.out.println("Founder: " + founder);
        System.out.println("Customer Support Number: " + custSprtNumber);
        System.out.println("Customer Support Email: " + custSprtMail);
    }
}
