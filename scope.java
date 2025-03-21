public class scope{
	int pqr= 12345;
	public static void main(String[] args){
		int abc=123;
		{
			abc=567;
			System.out.println(abc);
			char xyz='A';
		}
		//xyz='B';
		System.out.println(pqr);
		abc=789;
		System.out.println(abc);
		
	}
}