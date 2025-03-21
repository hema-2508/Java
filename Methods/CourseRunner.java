enum Course {
    JAVASCRIPT,
    PYTHON,
    DATA_SCIENCE,
    AI_ML,
    WEB_DEVELOPMENT;
}

 class CourseInfo {
    public static void main(String[] args) {
        Course selectedCourse = Course.DATA_SCIENCE;
        
        int trainingCost = getTrainingCost(selectedCourse);
        
        System.out.println("Course: " + selectedCourse);
        System.out.println("Training Cost: Rupees " + trainingCost);
    }

    public static int getTrainingCost(Course course) {
        if (course == Course.JAVASCRIPT) {
            return 10000;
        } else if (course == Course.PYTHON) {
            return 8000;
        } else if (course == Course.DATA_SCIENCE) {
            return 20000;
        } else if (course == Course.AI_ML) {
            return 25000;
        } else if (course == Course.WEB_DEVELOPMENT) {
            return 15000;
        } else {
            return 0;q
        }
    }
}