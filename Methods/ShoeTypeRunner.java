enum Shoe{
	SIZE, LENGTH, BRAND, COLOR;
}

class ShoeType{
	public static Shoe buyShoe(Shoe name){
		if(name == Shoe.SIZE){
			System.out.println("6");
		}
		else if(name == Shoe.LENGTH){
			System.out.println("14cm");
		}
		else if(name == Shoe.BRAND){
			System.out.println("BATA");
		}
		else if(name == Shoe.COLOR){
			System.out.println("Black");
		}
		else{
			System.out.println("Not found");
		}
		return name;
	}
	public static void main(String[] args){
		Shoe chappal=Shoe.BRAND;
		System.out.println(buyShoe(chappal));
	}
}