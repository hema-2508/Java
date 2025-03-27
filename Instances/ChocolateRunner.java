class ChocolateRunner{
	public static void main(String[] args){
		Chocolate chocolate1= new Chocolate(
		"silk","dairy milk",28.8,4.5,100,"vanilla","dark chocolate",
		2.3,3.4,5.5,6700000,7872000,"South Africa",2002,
		"Ambani",81054,"dairymary@gmail.com","Indian","brown",true
		);
		Chocolate chocolate2 = new Chocolate(
            "KitKat", "Nestle", 40.0, 4.7, 120, "Chocolate", "Wafer Chocolate",
            3.1, 4.0, 6.2, 8000000, 9500000, "Switzerland", 1935, 
            "Rowntree's", 9876543210L, "kitkat@nestle.com", "Global", "Red", false
        );

        
        Chocolate chocolate3 = new Chocolate(
            "Ferrero Rocher", "Ferrero", 30.5, 4.9, 250, "Hazelnut", "Milk Chocolate",
            2.8, 5.0, 7.0, 5000000, 10000000, "Italy", 1982, 
            "Pietro Ferrero", 1122334455L, "ferrero@rocher.com", "European", "Gold", true
        );
	}
}

/* String chocolateName;
	String brand;
	double quantity;
	double ratings;
	int cost;
	String flavour;
	String type;
	double sugarContent;
	double calories;
	double nutrients;
	long annualSales;
	long annualIncome;
	String originPlace;
	int originYear;
	String founder;
	long custSprtNumber;
	String custSprtMail;
	String branch;
	String color;
	boolean addedFruits; */