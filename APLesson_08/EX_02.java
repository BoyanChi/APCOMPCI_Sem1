import java.util.Scanner;
public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter one word.");
		String word1 = keyboard.next();
		System.out.println("Please enter another word.");
		String word2 = keyboard.next();
		System.out.println("Please enter another word.");
		String word3 = keyboard.next();
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
		
	}
	public static String makeCenter(String word)
	{
		if (word.length() >= 20)
			return word;
		else
			return makeCenter(" " + word + " ");
	}
}