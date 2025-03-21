import java.util.Arrays;
class ContactSearchRunner{
	public static void main(String[] args){
		String[] names={"kareena kapoor", "aishwarya kapoor","salman kapoor","soniya kapoor","agarwal kapoor","Ranveer khan"};
		String[] names1={"kareena shetty", "aishwarya shetty","salman khan","soniya shetty","agarwal shetty","Ranveer shetty"};
		String[] names2={"kareena sharma", "aishwarya sharma","salman sharma","soniya shetty","agarwal sharma","Ranveer sharma"};
		String[] productNames={"car", "bike","mobile","watch","speaker","fan"};
		String[] out={null,null,null,null,null,null};
		System.out.println(ContactSearch.getMobileByEmail("hema@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("naveen@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("kanaka@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("raju@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("nagesh@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("jerry@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("bujji@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("teddy@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("sonal@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("vaibhav@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("kitty@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("ammu@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("hemm@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("ramu@1234.gmail.com"));
		System.out.println(ContactSearch.getMobileByEmail("tommy@1234.gmail.com"));
		
		System.out.println(ContactSearch.getEmailByName("Hema"));
		System.out.println(ContactSearch.getEmailByName("naveen"));
		System.out.println(ContactSearch.getEmailByName("kanaka"));
		System.out.println(ContactSearch.getEmailByName("raju"));
		System.out.println(ContactSearch.getEmailByName("nagesh"));
		System.out.println(ContactSearch.getEmailByName("jerry"));
		System.out.println(ContactSearch.getEmailByName("bujji"));
		System.out.println(ContactSearch.getEmailByName("teddy"));
		System.out.println(ContactSearch.getEmailByName("sonal"));
		System.out.println(ContactSearch.getEmailByName("vaibhav"));
		System.out.println(ContactSearch.getEmailByName("kitty"));
		System.out.println(ContactSearch.getEmailByName("ammu"));
		System.out.println(ContactSearch.getEmailByName("hemm"));
		System.out.println(ContactSearch.getEmailByName("ramu"));
		System.out.println(ContactSearch.getEmailByName("tommy"));
		
		out=ContactSearch.searchByLastName(names);
		for (int i=0;i<out.length;i++) {
			System.out.println(out[i]);
		}
		out=ContactSearch.searchByLastNames(names1);
		for (int i=0;i<out.length;i++) {
			System.out.println(out[i]);
		}
		out=ContactSearch.searchByLastNames1(names2);
		for (int i=0;i<out.length;i++) {
			System.out.println(out[i]);
		}
		
		
		
		
	}
}