class Planet {
    String name;
    double mass; 
    double radius; 
    double gravity; 
    double orbitalPeriod; 
    double distanceFromSun; 
    int numberOfMoons;
    boolean hasRings;
    boolean supportsLife;
    String atmosphereComposition;
    double surfaceTemperature; 
    double axialTilt; 
    int discoveryYear;
    String discoveredBy;
    boolean isDwarfPlanet;
    double rotationPeriod; 
    double density; 
    double albedo; 
    String planetType;
    String dominantElement;
    long estimatedPopulation; 

    public Planet(
        String name, double mass, double radius, double gravity, double orbitalPeriod, 
        double distanceFromSun, int numberOfMoons, boolean hasRings, boolean supportsLife, 
        String atmosphereComposition, double surfaceTemperature, double axialTilt, int discoveryYear, 
        String discoveredBy, boolean isDwarfPlanet, double rotationPeriod, double density, 
        double albedo, String planetType, String dominantElement, long estimatedPopulation
    ) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.gravity = gravity;
        this.orbitalPeriod = orbitalPeriod;
        this.distanceFromSun = distanceFromSun;
        this.numberOfMoons = numberOfMoons;
        this.hasRings = hasRings;
        this.supportsLife = supportsLife;
        this.atmosphereComposition = atmosphereComposition;
        this.surfaceTemperature = surfaceTemperature;
        this.axialTilt = axialTilt;
        this.discoveryYear = discoveryYear;
        this.discoveredBy = discoveredBy;
        this.isDwarfPlanet = isDwarfPlanet;
        this.rotationPeriod = rotationPeriod;
        this.density = density;
        this.albedo = albedo;
        this.planetType = planetType;
        this.dominantElement = dominantElement;
        this.estimatedPopulation = estimatedPopulation;

        System.out.println("Planet Name: " + name);
        System.out.println("Mass: " + mass + " Earth masses");
        System.out.println("Radius: " + radius + " km");
        System.out.println("Gravity: " + gravity + " m/s²");
        System.out.println("Orbital Period: " + orbitalPeriod + " days");
        System.out.println("Distance from Sun: " + distanceFromSun + " million km");
        System.out.println("Number of Moons: " + numberOfMoons);
        System.out.println("Has Rings? " + hasRings);
        System.out.println("Supports Life? " + supportsLife);
        System.out.println("Atmosphere Composition: " + atmosphereComposition);
        System.out.println("Surface Temperature: " + surfaceTemperature + "°C");
        System.out.println("Axial Tilt: " + axialTilt + " degrees");
        System.out.println("Discovery Year: " + discoveryYear);
        System.out.println("Discovered By: " + discoveredBy);
        System.out.println("Is Dwarf Planet? " + isDwarfPlanet);
        System.out.println("Rotation Period: " + rotationPeriod + " hours");
        System.out.println("Density: " + density + " g/cm³");
        System.out.println("Albedo: " + albedo);
        System.out.println("Planet Type: " + planetType);
        System.out.println("Dominant Element: " + dominantElement);
        System.out.println("Estimated Population: " + estimatedPopulation);
       
    }
}