import java.util.Scanner;
public class EX_04
{
	static int start ; 
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = keyboard.next();
		int stop = word.length();
		for(int i = 0; i < stop; i++)
		{
			for(int j = 0; j < i; j++)
				System.out.print(" ");
			for(int j = 0; j < stop - i; j++)
				System.out.print((tree(word,start,stop)));
		}
		System.out.println();
	}
	public static String tree(String word, int start, int stop)
	{
		if(start <= stop)
			System.out.println(word.substring(0,start));
			start ++;
			return tree(word,start,stop);
		
	}
}
		