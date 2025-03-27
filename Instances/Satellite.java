class Satellite {
    String name;
    String country;
    String type;
    double weight;
    double orbitalHeight;
    double speed;
    int launchYear;
    String launchVehicle;
    String missionPurpose;
    boolean active;
    long cost;
    String manufacturer;
    double powerCapacity;
    int missionDuration;
    boolean reusable;
    String launchSite;
    String operator;
    double signalFrequency;
    int numberOfTransponders;
    String fuelType;

    public Satellite(String name, String country, String type, double weight, double orbitalHeight,
                     double speed, int launchYear, String launchVehicle, String missionPurpose, boolean active,
                     long cost, String manufacturer, double powerCapacity, int missionDuration, boolean reusable,
                     String launchSite, String operator, double signalFrequency, int numberOfTransponders, String fuelType) {
        this.name = name;
        this.country = country;
        this.type = type;
        this.weight = weight;
        this.orbitalHeight = orbitalHeight;
        this.speed = speed;
        this.launchYear = launchYear;
        this.launchVehicle = launchVehicle;
        this.missionPurpose = missionPurpose;
        this.active = active;
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.powerCapacity = powerCapacity;
        this.missionDuration = missionDuration;
        this.reusable = reusable;
        this.launchSite = launchSite;
        this.operator = operator;
        this.signalFrequency = signalFrequency;
        this.numberOfTransponders = numberOfTransponders;
        this.fuelType = fuelType;

        System.out.println("Satellite Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Orbital Height: " + orbitalHeight + " km");
        System.out.println("Speed: " + speed + " km/s");
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Mission Purpose: " + missionPurpose);
        System.out.println("Active: " + active);
        System.out.println("Cost: $" + cost);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Power Capacity: " + powerCapacity + " kW");
        System.out.println("Mission Duration: " + missionDuration + " years");
        System.out.println("Reusable: " + reusable);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Operator: " + operator);
        System.out.println("Signal Frequency: " + signalFrequency + " GHz");
        System.out.println("Number of Transponders: " + numberOfTransponders);
        System.out.println("Fuel Type: " + fuelType);
    }
}
