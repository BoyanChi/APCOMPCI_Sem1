import java.util.Scanner;
public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		{
			System.out.prinln("Please enter your toy list.");
			String ToyList = keyboard.nextLine();
			ToyStore object = new ToyStore(ToyList);
			System.out.println("\n");
			System.out.println(object);
			System.out.println("\n");
			System.out.println("Most Frequent Toy: " + object.getMostFrequentToy());
			System.out.println("Most Frequent Type: " + object.getMostFrequentType());
		}
	}
}