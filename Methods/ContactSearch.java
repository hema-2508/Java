class ContactSearch{
	static long getMobileByEmail(String mail){
		long number=8105404248L;
		if(mail=="hema@1234.gmail.com"){
			number=8105404248L;
			return number;
		}
		else if(mail=="naveen@1234.gmail.com"){
			number=9035750717L;
			return number;
		}
		else if(mail=="kanaka@1234.gmail.com"){
			number=8317342434L;
			return number;
		}
		else if(mail=="raju@1234.gmail.com"){
			number=9845268134L;
			return number;
		}
		else if(mail=="nagesh@1234.gmail.com"){
			number=6360860539L;
			return number;
		}
		else if(mail=="jerry@1234.gmail.com"){
			number=8105404249L;
			return number;
		}
		else if(mail=="bujji@1234.gmail.com"){
			number=8105404250L;
			return number;
		}
		else if(mail=="teddy@1234.gmail.com"){
			number=9845268135L;
			return number;
		}
		else if(mail=="sonal@1234.gmail.com"){
			number=6360860539L;
			return number;
		}
		else if(mail=="vaibhav@1234.gmail.com"){
			number=8380650765L;
			return number;
		}
		else if(mail=="kitty@1234.gmail.com"){
			number=9876543218L;
			return number;
		}
		else if(mail=="ammu@1234.gmail.com"){
			number=897654125L;
			return number;
		}
		else if(mail=="hemm@1234.gmail.com"){
			number=8753985435L;
			return number;
		}
		else if(mail=="ramu@1234.gmail.com"){
			number=9465376877L;
			return number;
		}
		else if(mail=="tommy@1234.gmail.com"){
			number=6587576489L;
			return number;
		}
		else{
			System.out.println("mail not found");
			return 0;
		}
	}
	static String getEmailByName(String name){
		String mail="abc";
		if(name=="Hema"){
			mail="hema@1234.gmail.com";
			return mail;
		}
		else if(name=="naveen"){
			mail="naveen@1234.gmail.com";
			return mail;
		}
		else if(name=="kanaka"){
			mail="kanaka@1234.gmail.com";
			return mail;
		}
		else if(name=="raju"){
			mail="raju@1234.gmail.com";
			return mail;
		}
		else if(name=="nagesh"){
			mail="nagesh@1234.gmail.com";
			return mail;
		}
		else if(name=="jerry"){
			mail="jerry@1234.gmail.com";
			return mail;
		}
		else if(name=="bujji"){
			mail="bujji@1234.gmail.com";
			return mail;
		}
		else if(name=="teddy"){
			mail="teddy@1234.gmail.com";
			return mail;
		}
		else if(name=="sonal"){
			mail="sonal@1234.gmail.com";
			return mail;
		}
		else if(name=="vaibhav"){
			mail="vaibhav@1234.gmail.com";
			return mail;
		}
		else if(name=="kitty"){
			mail="kitty@1234.gmail.com";
			return mail;
		}
		else if(name=="ammu"){
			mail="ammu@1234.gmail.com";
			return mail;
		}
		else if(name=="hemm"){
			mail="hemm@1234.gmail.com";
			return mail;
		}
		else if(name=="ramu"){
			mail="ramu@1234.gmail.com";
			return mail;
		}
		else if(name=="tommy"){
			mail="tommy@1234.gmail.com";
			return mail;
		}
		else{
			System.out.println("mail not found");
			return null;
		}
	}
	static String[] searchByLastName(String[] names){
		String[] arr={null,null,null,null,null};
		int index=0;
		for (int i=0;i<names.length;i++) {
            if (names[i].endsWith(" kapoor")) { 
                arr[index]=names[i];
				index++;
			}
		//return arr;
		}			
	return arr;
	}
	static String[] searchByLastNames(String[] names){
		String[] arr={null,null,null,null,null};
		int index=0;
		for (int i=0;i<names.length;i++) {
            if (names[i].endsWith(" shetty")) { 
                arr[index]=names[i];
				index++;
			}
		//return arr;
		}			
	return arr;
	}
	static String[] searchByLastNames1(String[] names){
		String[] arr={null,null,null,null,null};
		int index=0;
		for (int i=0;i<names.length;i++) {
            if (names[i].endsWith(" sharma")) { 
                arr[index]=names[i];
				index++;
			}
		//return arr;
		}			
	return arr;
	}
	 
}