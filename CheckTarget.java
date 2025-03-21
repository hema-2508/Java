public class CheckTarget {
    public static void main(String[] args) {
        int[] arr = {5, 12, 23, 34, 45, 56};
        int target = 23; // Randomly chosen target number to check

        boolean found = false;
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        // Print result
        System.out.println("Target Number: " + target);
        if (found) {
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}