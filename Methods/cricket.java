class Cricket{
	public static void matchDetails(String[] days, String... playerNames){
		for(int i=0;i<days.length-1;i++){
			System.out.println("Names "+ playerNames[i]+ "\nDays : "+days[i]);
		}
	}
	public static void matchDetails(String name, int matches, int totalRun){
		System.out.println("playerName : "+name);
		System.out.println("Number of matches : "+matches);
		System.out.println("total runs : "+totalRun);
		int Avg= totalRun/matches;
		System.out.println("Avg Score : "+Avg);
	}
	public static void matchDetails(String[] names, int[] scores, int[] noMatches){
		int[] Avg={0,0,0,0};
		for(int i=0;i<scores.length-1;i++){
			Avg[i]= scores[i]/noMatches[i];
			System.out.println("Names "+ names[i]+ "  Scores: "+scores[i]+"   No of matches: "+noMatches[i]+ "  Average Score "+Avg[i]);
		}
	}
	
}