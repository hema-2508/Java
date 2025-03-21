class Box{
	public static void main(String args[]){
		//System.out.println("Hi");
		String colour1="Red";
		String colour2="Blue";
		String colour3="Green";
		String colour4="Yellow";
		String colour5="Orange";
		String colour6="Purple";
		String colour7="Pink";
		String colour8="Brown";
		String colour9="Black";
		String colour10="White";
		String colour11="Grey";
		String colour12="Cyan";
		String colour13="Magenta";
		String colour14="Lime";
		String colour15="Indigo";
		String colour16="Violet";
		String colour17="Teal";
		String colour18="Turquoise";
		String colour19="Maroon";
		String colour20="Navy Blue";
		String colour21="Olive";
		String colour22="Coral";
		String colour23="Salmon";
		String colour24="Beige";
		String colour25="Gold";
		String colour26="Silver";
		String colour27="Bronze";
		String colour28="Peach";
		String colour29="Lavender";
		String colour30="Mint";
		String[] colours={colour1,colour2,colour3,colour4,colour5,colour6,colour7,colour8,colour9,colour10,colour11,colour12,colour13,colour14,colour15,colour16,colour17,colour18,colour19,colour20,colour21,colour22,colour23,colour24,colour25,colour26,colour26,colour27,colour28,colour29,colour30};
		System.out.println("colour 1 "+colours[0]);
		System.out.println("colour 2 "+colours[1]);
		System.out.println("colour 3 "+colours[2]);
		System.out.println("colour 4 "+colours[3]);
		System.out.println("colour 5 "+colours[4]);
		System.out.println("colour 6 "+colours[5]);
		System.out.println("colour 7 "+colours[6]);
		System.out.println("colour 8 "+colours[7]);
		System.out.println("colour 9 "+colours[8]);
		System.out.println("colour 10 "+colours[9]);
		System.out.println("colour 11 "+colours[10]);
		System.out.println("colour 12 "+colours[11]);
		System.out.println("colour 13 "+colours[12]);
		System.out.println("colour 14 "+colours[13]);
		System.out.println("colour 15 "+colours[14]);
		System.out.println("colour 16 "+colours[15]);
		System.out.println("colour 17 "+colours[16]);
		System.out.println("colour 18 "+colours[17]);
		System.out.println("colour 19 "+colours[18]);
		System.out.println("colour 20 "+colours[19]);
		System.out.println("colour 21 "+colours[20]);
		System.out.println("colour 22 "+colours[21]);
		System.out.println("colour 23 "+colours[22]);
		System.out.println("colour 24 "+colours[23]);
		System.out.println("colour 25 "+colours[24]);
		System.out.println("colour 26 "+colours[25]);
		System.out.println("colour 27 "+colours[26]);
		System.out.println("colour 28 "+colours[27]);
		System.out.println("colour 29 "+colours[28]);
		System.out.println("colour 30 "+colours[29]);
		colours[0]="Charcoal";
		colours[1]="Amber";
		colours[2]="Aqua";
		colours[3]="Azure";
		colours[4]="Burgundy";
		colours[5]="Champagne";
		colours[6]="Chocolate";
		colours[7]="Emerald";
		colours[8]="Fuchsia";
		colours[9]="Ivory";
		colours[10]="Jade";
		colours[11]="Khaki";
		colours[12]="Lilac";
		colours[13]="Mustard";
		colours[14]="Onyx";
		colours[15]="Periwinkle";
		colours[16]="Rose";
		colours[17]="Ruby";
		colours[18]="Sapphire";
		colours[19]="Scarlet";
		colours[20]="Sepia";
		colours[21]="Slate";
		colours[22]="Tan";
		colours[23]="Topaz";
		colours[24]="Zinc";
		colours[25]="Blush";
		colours[26]="Pistachio";
		colours[27]="Plum";
		colours[28]="Mahogany";
		colours[29]="Cobalt";
		System.out.println("New set of colours");
		System.out.println("colour 1 "+colours[0]);
		System.out.println("colour 2 "+colours[1]);
		System.out.println("colour 3 "+colours[2]);
		System.out.println("colour 4 "+colours[3]);
		System.out.println("colour 5 "+colours[4]);
		System.out.println("colour 6 "+colours[5]);
		System.out.println("colour 7 "+colours[6]);
		System.out.println("colour 8 "+colours[7]);
		System.out.println("colour 9 "+colours[8]);
		System.out.println("colour 10 "+colours[9]);
		System.out.println("colour 11 "+colours[10]);
		System.out.println("colour 12 "+colours[11]);
		System.out.println("colour 13 "+colours[12]);
		System.out.println("colour 14 "+colours[13]);
		System.out.println("colour 15 "+colours[14]);
		System.out.println("colour 16 "+colours[15]);
		System.out.println("colour 17 "+colours[16]);
		System.out.println("colour 18 "+colours[17]);
		System.out.println("colour 19 "+colours[18]);
		System.out.println("colour 20 "+colours[19]);
		System.out.println("colour 21 "+colours[20]);
		System.out.println("colour 22 "+colours[21]);
		System.out.println("colour 23 "+colours[22]);
		System.out.println("colour 24 "+colours[23]);
		System.out.println("colour 25 "+colours[24]);
		System.out.println("colour 26 "+colours[25]);
		System.out.println("colour 27 "+colours[26]);
		System.out.println("colour 28 "+colours[27]);
		System.out.println("colour 29 "+colours[28]);
		System.out.println("colour 30 "+colours[29]);
	}
}
class ClothStore {
    public static void main(String[] args) {
        
        String[] clothes = {
            "Shirt", "T-shirt", "Jeans", "Trousers", "Kurta", "Saree", "Salwar", "Dupatta", "Shorts", "Skirt",
            "Jacket", "Blazer", "Sweater", "Hoodie", "Coat", "Leggings", "Dungarees", "Overcoat", "Windcheater", "Waistcoat",
            "Gown", "Lehenga", "Tracksuit", "Sherwani", "Nightwear"
        };

        
        System.out.println("Initial Clothing Items:");
        for (int i = 0; i < clothes.length; i++) {
            System.out.println("Cloth[" + i + "]: " + clothes[i]);
        }

        
        for (int i = 0; i < clothes.length; i++) {
            clothes[i] = clothes[i].toUpperCase();
        }

        System.out.println("\nUpdated Clothing Items (Uppercase):");
        for (int i = 0; i < clothes.length; i++) {
            System.out.println("Cloth[" + i + "]: " + clothes[i]);
        }
    }
}
class LocationStore {
    public static void main(String[] args) {
        
        String[] locations = {
            "Mumbai", "Delhi", "Bangalore", "Chennai", "Kolkata", "Hyderabad", "Pune", "Ahmedabad", "Jaipur", "Lucknow",
            "Coimbatore", "Thiruvananthapuram", "Nagpur", "Bhopal", "Indore", "Mysore", "Vijayawada", "Surat", "Patna", "Chandigarh"
        };

        System.out.println("Initial Locations:");
        for (int i = 0; i < locations.length; i++) {
            System.out.println("Location[" + i + "]: " + locations[i]);
        }

        
        for (int i = 0; i < locations.length; i++) {
            locations[i] = locations[i].toUpperCase();
        }

        
        System.out.println("\nUpdated Locations (Uppercase):");
        for (int i = 0; i < locations.length; i++) {
            System.out.println("Location[" + i + "]: " + locations[i]);
        }
    }
}
class ShoeBrands {
    public static void main(String[] args) {
        
        String[] brands = {
            "Bata", "Liberty", "Relaxo", "Red Chief", "Lakhani", "Paragon", "Action", "Woodland",
            "Metro", "Khadim's", "Lee Cooper", "Puma India", "Nike India", "Reebok India", "Adidas India",
            "Campus", "Sparx", "Furo", "Asian", "HRX", "Big Fox", "Vostro", "Marc Loire", "Bond Street"
        };

        
        System.out.println("Initial Shoe Brands:");
        for (int i = 0; i < brands.length; i++) {
            System.out.println("Brand[" + i + "]: " + brands[i]);
        }

       
        for (int i = 0; i < brands.length; i++) {
            brands[i] = brands[i].toUpperCase();
        }

        
        System.out.println("\nUpdated Shoe Brands (Uppercase):");
        for (int i = 0; i < brands.length; i++) {
            System.out.println("Brand[" + i + "]: " + brands[i]);
        }
    }
}
class CerealStore {
    public static void main(String[] args) {
        
        String[] cereals = {
            "Wheat", "Rice", "Barley", "Oats", "Maize", "Rye", "Millet", "Sorghum", "Quinoa", "Corn",
            "Spelt", "Teff", "Triticale", "Fonio", "Einkorn", "Farro", "Buckwheat", "Amaranth", "Chia", "Kamut"
        };

        
        System.out.println("Initial Cereals:");
        for (int i = 0; i < cereals.length; i++) {
            System.out.println("Cereal[" + i + "]: " + cereals[i]);
        }

        
        for (int i = 0; i < cereals.length; i++) {
            cereals[i] = cereals[i].toUpperCase();
        }

        
        System.out.println("\nUpdated Cereals (Uppercase):");
        for (int i = 0; i < cereals.length; i++) {
            System.out.println("Cereal[" + i + "]: " + cereals[i]);
        }
    }
}