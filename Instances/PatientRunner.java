class PatientRunner {
    public static void main(String... args) {
        Patient patient = new Patient();
        System.out.println("Condition = " + patient.condition);
        System.out.println("Age = " + patient.age);
        System.out.println("Response = " + patient.response);
        System.out.println("Heart Rate = " + patient.heartRate);

        patient.condition = "Diabetes";
        patient.age = 45;
        patient.response = "Slow";
        patient.heartRate = 72;

        System.out.println("---Updated values---");
        System.out.println("Condition = " + patient.condition);
        System.out.println("Age = " + patient.age);
        System.out.println("Response = " + patient.response);
        System.out.println("Heart Rate = " + patient.heartRate);
    }
}