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
		System.out.print(tree(word, start, stop));
	}
	public static String tree(String word, int start, int stop)
	{
		if(start <= stop)
		System.out.printf("%20s\n", word.substring(0,start));
		start ++;
		return tree(word, start, stop);	
	}
}
		