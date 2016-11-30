import java.util.Scanner;
public class EX_02
{
	static char AA;
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter 5 words.");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = keyboard.next();
		}
		first(words);
	}
	public static void first(String [] words)
	{
		for(String word : words)
		{
			System.out.print(" " + word.charAt(1) + " ");
		}
		
	}
}