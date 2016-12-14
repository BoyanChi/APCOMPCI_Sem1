import java.util.Scanner;
public class EX_04
{
	static int start = 1; 
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = keyboard.next();
		int stop = word.length();
		tree(word, start, stop);
	}
	public static void tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("%10s\n", word.substring(0,start));
			start ++;
			tree(word, start, stop);	
		}
	}
}
		