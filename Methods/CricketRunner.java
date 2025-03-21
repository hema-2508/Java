class CricketRunner{
			
	public static void main(String[] values){
		String[] days={" Monday "," Tuesday "};
		String[] playerNames={" Virat "," dhoni "};
		Cricket.matchDetails(days,playerNames);
		Cricket.matchDetails(" Dhoni ",3,300);
		String[] names={" Virat "," dhoni "};
		int[] scores={100,200,300};
		int[] noMatches={1,2,3};
		Cricket.matchDetails(names,scores,noMatches);
		
	}
}