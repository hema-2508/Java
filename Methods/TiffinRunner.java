enum Tiffin{
	SQUARE,ROUND,RECTANGLE,DIAMOND;
}
class Boxes{
	public static Tiffin methodToCall(Tiffin name){
		if(name==Tiffin.SQUARE){
			System.out.println("100");
		}
		else if(name==Tiffin.ROUND){
			System.out.println("150");
		}
		else if(name==Tiffin.RECTANGLE){
			System.out.println("200");
		}
		else if(name==Tiffin.DIAMOND){
			System.out.println("250");
		}
		return name;
	}
	public static void main(String[] values){
		System.out.println(methodToCall(Tiffin.SQUARE));
	}
}