import java.util.Arrays;

public class ArrayOperations{
    public static void Sort(int[] intArr)
    {
		Arrays.sort(intArr);
         for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " "); 
        }
		//System.out.print();
		
    }
	public static void search(int[] intArr,int num)
    {
		boolean found=false;
		System.out.println("Searching");
        for (int i = 0; i < intArr.length; i++) {
			if(intArr[i]==num){
			System.out.println(num + " found at index " + i);
				found=true;
				break;
			}
		}
		if(found==false){
			System.out.println("Not found");
		}
              
    }
	public static void copy(int[] intArr)
    {
		int copiedArr[]={0,0,0,0,0,0};
		for (int i = 0; i < intArr.length; i++) {
			copiedArr[i]=intArr[i];
			
			System.out.print(copiedArr[i] + " ");  
        }
    }
		
}

