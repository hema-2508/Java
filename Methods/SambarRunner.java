
public class SambarRunner{
    public static void main(String[] args)
    {
		int[] intArr = { 10, 20, 15, 22, 35 };
		int findNum=23;
        String[] ref=Sambar.vegetables();
		for(String veg:ref){
			System.out.println(veg+" ");
		}
		int refs=Sambar.quantity();
		System.out.println(refs);
		boolean referen=Sambar.temp();
		System.out.println(referen);
		boolean reference=Sambar.taste();
		System.out.println(reference);
		
    }
}