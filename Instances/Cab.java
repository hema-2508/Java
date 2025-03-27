class Cab {
    String cabName;
    String company;
    String model;
    String registrationNumber;
    String driverName;
    String driverLicense;
    String fuelType;
    String cabType;
    int seatingCapacity;
    double farePerKm;
    double totalEarnings;
    double totalDistanceCovered;
    int yearsInService;
    boolean isAvailable;
    boolean hasAC;
    double customerRating;
    String customerSupportMail;
    long customerSupportNumber;
    String operatingCity;
    String color;

    public Cab(String cabName, String company, String model, String registrationNumber, 
               String driverName, String driverLicense, String fuelType, String cabType, 
               int seatingCapacity, double farePerKm, double totalEarnings, double totalDistanceCovered, 
               int yearsInService, boolean isAvailable, boolean hasAC, double customerRating, 
               String customerSupportMail, long customerSupportNumber, String operatingCity, String color) {
        this.cabName = cabName;
        this.company = company;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.driverName = driverName;
        this.driverLicense = driverLicense;
        this.fuelType = fuelType;
        this.cabType = cabType;
        this.seatingCapacity = seatingCapacity;
        this.farePerKm = farePerKm;
        this.totalEarnings = totalEarnings;
        this.totalDistanceCovered = totalDistanceCovered;
        this.yearsInService = yearsInService;
        this.isAvailable = isAvailable;
        this.hasAC = hasAC;
        this.customerRating = customerRating;
        this.customerSupportMail = customerSupportMail;
        this.customerSupportNumber = customerSupportNumber;
        this.operatingCity = operatingCity;
        this.color = color;

        System.out.println("Cab Details:");
        System.out.println("Cab Name: " + cabName);
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Driver License: " + driverLicense);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fare Per Km: ₹" + farePerKm);
        System.out.println("Total Earnings: ₹" + totalEarnings);
        System.out.println("Total Distance Covered: " + totalDistanceCovered + " km");
        System.out.println("Years in Service: " + yearsInService);
        System.out.println("Available: " + isAvailable);
        System.out.println("Has AC: " + hasAC);
        System.out.println("Customer Rating: " + customerRating);
        System.out.println("Customer Support Email: " + customerSupportMail);
        System.out.println("Customer Support Number: " + customerSupportNumber);
        System.out.println("Operating City: " + operatingCity);
        System.out.println("Color: " + color);
    }
}
