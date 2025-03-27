class TabRunner {
    public static void main(String[] args) {
			Tab tab1 = new Tab(
            "Galaxy Tab S9", "Samsung", 11.0, 3.1, 8, 256, 
            "Android", "Snapdragon 8 Gen 2", 10090, 0.5, 13, 
            true, true, 2023, "Black", 2, 
            500000, 500000000, "South Korea", 18001234567L, "support@samsung.com"
        );

        Tab tab2 = new Tab(
            "iPad Pro", "Apple", 12.9, 3.2, 16, 512, 
            "iPadOS", "Apple M2", 9720, 0.6, 12, 
            true, true, 2022, "Silver", 1, 
            800000, 800000000, "USA", 18005551234L, "support@apple.com"
        );

        Tab tab3 = new Tab(
            "Lenovo Tab P12 Pro", "Lenovo", 12.6, 3.0, 6, 128, 
            "Android", "Snapdragon 870", 10200, 0.65, 8, 
            true, false, 2021, "Grey", 1, 
            300000, 300000000, "China", 18009998888L, "support@lenovo.com"
        );
    }
}
