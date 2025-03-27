class CabRunner {
    public static void main(String[] args) {
        Cab cab1 = new Cab(
            "UberX", "Uber", "Toyota Etios", "KA-05-1234", "Rahul Sharma", "DL-123456",
            "Petrol", "Sedan", 4, 12.5, 500000, 80000, 5, true, true, 
            4.7, "support@uber.com", 9876543210L, "Bangalore", "White"
        );

        Cab cab2 = new Cab(
            "Ola Prime", "Ola", "Honda City", "MH-12-5678", "Amit Verma", "DL-789123",
            "Diesel", "Sedan", 4, 14.0, 650000, 90000, 6, false, true, 
            4.8, "support@ola.com", 8765432109L, "Mumbai", "Black"
        );

        Cab cab3 = new Cab(
            "MeruCab", "Meru", "Maruti Swift Dzire", "TN-09-3456", "Suresh Kumar", "DL-456789",
            "CNG", "Hatchback", 4, 10.0, 400000, 75000, 4, true, false, 
            4.5, "support@merucabs.com", 7654321098L, "Chennai", "Blue"
        );
    }
}