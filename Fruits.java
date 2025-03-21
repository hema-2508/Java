public class Fruits {
    static int index = 0; 
    static String[] arrayName = {null, null, null, null}; 

    public static void addFruit(String fruitName) {
        for (; index < arrayName.length; index++) { 
            if (arrayName[index] == null) { 
                arrayName[index] = fruitName;
                System.out.println("Added: " + fruitName + " at index " + index);
                index++; 
                return;
            }
        }
        System.out.println("Array is full. Cannot add more fruits.");
    }
}