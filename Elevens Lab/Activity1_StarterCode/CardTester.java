/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("Heart", "7", 7);
		Card card2 = new Card("Heart", "7", 7);
		Card card3 = new Card("Heart", "K", 13);
		System.out.println("Card 1 and card 2 matches:" + card2.matches(card1));
		System.out.println("Card 2 and card 3 matches:" + !card2.matches(card3));
	}
}
