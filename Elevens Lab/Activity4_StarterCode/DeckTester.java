/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		System.out.println("Shuffle");
		String[] rank1 = new String[52];
		String[] suit1 = new String[52];
		int[] PV1 = new int[52];
		for(int i = 0; i < 52; i++)
		{
			String rank = "";
			String suit = "";
			if((i+1) % 13 == 11)
				rank = "J";
			if((i+1) % 13 == 12)
				rank = "Q";
			if((i+1) % 13 == 0)
				rank = "K";
			if((i+1) % 13 == 1)
				rank = "A";
			else
				rank = Integer.toString((i + 1) % 13);
			if(i < 13)
				suit = "Diamond";
			if(i < 26)
				suit = "Heart";
			if(i < 39)
				suit = "Cube";
			else
				suit = "Spade";
			rank1[i] = rank;
			suit1[i] = suit;
			PV1[i] = ((i+1) % 13);
		}
		Deck deck = new Deck(rank1, suit1, PV1);
		System.out.println(deck);
	}
}
