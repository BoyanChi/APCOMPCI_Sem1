import java.util.Scanner;
public class EX_07
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[]args)
	{
		String [] words = new String[5];
		fillArray(words);
		System.out.print("For the words...");
		printArray(words);
		System.out.print("");
		System.out.print("Only");
		hasZs(words);
		System.out.print("contain(s) the letter z.");
	}
	public static void fillArray(String [] words)
	{
		System.out.println("Please enter 5 words.");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = keyboard.next();
		}
	}
	public static void printArray(String [] words)
	{
		for(String word : words)
		System.out.print(" " + word + " ");
	}
	public static void hasZs(String [] words)
	{
		String zs = "";
		for(String word:words)
		{
			if (word.indexOf("z") >= 0)
			{
				zs += word + " ";
			}
		}
		System.out.print(" " + zs + " ");
	}
}