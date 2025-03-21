public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Print Original Array
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse the array
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        // Print Reversed Array
        System.out.print("\nReversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}