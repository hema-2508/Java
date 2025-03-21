import java.util.Arrays;

public class ArrayOperationsRunner{
    public static void main(String[] args)
    {
		int[] intArr = { 10, 20, 15, 22, 35 };
		int findNum=23;
        ArrayOperations.Sort(intArr);
		ArrayOperations.search(intArr,findNum);
		ArrayOperations.copy(intArr);
		
    }
}
