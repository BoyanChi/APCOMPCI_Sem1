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
		String[] rank1 = {"J", "Q", "K"};
		String[] suit1 = {"Heart", "Spade", "Diamond"};
		int[] value1 = {11, 12, 13};
		Deck deck = new Deck(rank1, suit1, value1);
		System.out.println("Deck size should be" + deck.size());
		
		String[] rank2 = {"1", "1", "5"};
		String[] suit2 = {"Heart", "Spade", "Heart"};
		int[] value2 = {1, 1, 5};
		Deck deck1 = new Deck(rank2, suit2, value2);
		System.out.println("Deck size should be" + deck1.size());
		
		String[] rank3 = {"J", "3", "9"};
		String[] suit3 = {"Heart", "Spade", "Diamond"};
		int[] value3 = {11, 3, 9};
		Deck deck2 = new Deck(rank3, suit3, value3);
		System.out.println("Deck size should be" + deck2.size());
	}
}
