public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 2, 6, 8};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of all elements: " + sum);
    }
}