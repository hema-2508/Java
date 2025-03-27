class Tab {
    String tabName;
    String brand;
    double screenSize;
    double processorSpeed;
    int ram;
    int storage;
    String os;
    String processorType;
    double batteryCapacity;
    double weight;
    int cameraResolution;
    boolean hasStylus;
    boolean supports5G;
    int releaseYear;
    String color;
    int warrantyPeriod;
    long annualSales;
    long annualRevenue;
    String originCountry;
    long customerSupportNumber;
    String customerSupportEmail;

    public Tab(String tabName, String brand, double screenSize, double processorSpeed, int ram, int storage, 
               String os, String processorType, double batteryCapacity, double weight, int cameraResolution, 
               boolean hasStylus, boolean supports5G, int releaseYear, String color, int warrantyPeriod, 
               long annualSales, long annualRevenue, String originCountry, long customerSupportNumber, 
               String customerSupportEmail) {
        
        this.tabName = tabName;
        this.brand = brand;
        this.screenSize = screenSize;
        this.processorSpeed = processorSpeed;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.processorType = processorType;
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
        this.cameraResolution = cameraResolution;
        this.hasStylus = hasStylus;
        this.supports5G = supports5G;
        this.releaseYear = releaseYear;
        this.color = color;
        this.warrantyPeriod = warrantyPeriod;
        this.annualSales = annualSales;
        this.annualRevenue = annualRevenue;
        this.originCountry = originCountry;
        this.customerSupportNumber = customerSupportNumber;
        this.customerSupportEmail = customerSupportEmail;

        System.out.println("Tab Name: " + tabName);
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Processor Speed: " + processorSpeed + " GHz");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Operating System: " + os);
        System.out.println("Processor Type: " + processorType);
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Camera Resolution: " + cameraResolution + " MP");
        System.out.println("Has Stylus? " + hasStylus);
        System.out.println("Supports 5G? " + supports5G);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Color: " + color);
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
        System.out.println("Annual Sales: " + annualSales);
        System.out.println("Annual Revenue: ₹" + annualRevenue);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Customer Support Number: " + customerSupportNumber);
        System.out.println("Customer Support Email: " + customerSupportEmail);
    }
}

