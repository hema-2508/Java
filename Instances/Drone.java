class Drone {
    String model;
    String brand;
    double weight;
    double maxSpeed;
    int batteryLife;
    double range;
    String cameraQuality;
    boolean gpsEnabled;
    boolean obstacleAvoidance;
    int flightModes;
    double chargingTime;
    int maxAltitude;
    String controllerType;
    boolean liveStreaming;
    int warrantyYears;
    String connectivity;
    long serialNumber;
    String manufacturer;
    String color;
    boolean foldable;

    public Drone(String model, String brand, double weight, double maxSpeed, int batteryLife, double range, 
                 String cameraQuality, boolean gpsEnabled, boolean obstacleAvoidance, int flightModes, 
                 double chargingTime, int maxAltitude, String controllerType, boolean liveStreaming, 
                 int warrantyYears, String connectivity, long serialNumber, String manufacturer, 
                 String color, boolean foldable) {
        this.model = model;
        this.brand = brand;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.batteryLife = batteryLife;
        this.range = range;
        this.cameraQuality = cameraQuality;
        this.gpsEnabled = gpsEnabled;
        this.obstacleAvoidance = obstacleAvoidance;
        this.flightModes = flightModes;
        this.chargingTime = chargingTime;
        this.maxAltitude = maxAltitude;
        this.controllerType = controllerType;
        this.liveStreaming = liveStreaming;
        this.warrantyYears = warrantyYears;
        this.connectivity = connectivity;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.color = color;
        this.foldable = foldable;

        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Battery Life: " + batteryLife + " min");
        System.out.println("Range: " + range + " km");
        System.out.println("Camera Quality: " + cameraQuality);
        System.out.println("GPS Enabled: " + gpsEnabled);
        System.out.println("Obstacle Avoidance: " + obstacleAvoidance);
        System.out.println("Flight Modes: " + flightModes);
        System.out.println("Charging Time: " + chargingTime + " hours");
        System.out.println("Max Altitude: " + maxAltitude + " meters");
        System.out.println("Controller Type: " + controllerType);
        System.out.println("Live Streaming: " + liveStreaming);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Color: " + color);
        System.out.println("Foldable: " + foldable);
    }
}