public class Biriyani{
	public static void main(String[] args){
		byte num=2;
		short chickenpieces = 10;
		int cost=100;
		long sales=1000;
		float weight=30.5f;
		double calories=80.766;
		char grade='A';
		boolean bone= true;
		String name= "Ambur";
		byte plate=4;
		short legpiece = 20;
		int price=400;
		long ysales=1300;
		float grams=70.95f;
		double protien=100.766;
		char quality='B';
		boolean wings= false;
		String Bname= "thalapakattu";
		num=plate;
		chickenpieces=legpiece;
		cost=price;
		sales=ysales;
		weight=grams;
		calories=protien;
		grade=quality;
		bone=wings;
		name=Bname;
		System.out.println(num);
		System.out.println(chickenpieces);
		System.out.println(cost);
		System.out.println(sales);
		System.out.println(weight);
		System.out.println(calories);
		System.out.println(grade);
		System.out.println(bone);
		System.out.println(name);
	}
}
class ifloop{
	public static void main(String[] args){
		int age=10;
		if(age>=18){
			System.out.println("eligible");
		}
		else{
			System.out.println("not eligible");
		}
	}
}

class forloop{
	public static void main(String[] args){
		for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }
		
	}
}

class whileloop{
	public static void main(String[] args){
		int count = 1;
        while (count <= 5) {
            System.out.println("While Loop Count: " + count);
            count++;
        }
		
	}
}

class switchcase{
	public static void main(String[] args){
		 int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
		
	}
}