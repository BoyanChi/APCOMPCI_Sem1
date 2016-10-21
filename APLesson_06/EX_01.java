import java.util.Scanner;
public class EX_01
{
		
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = keyboard.next();
		
		for(int i = 1 ;i <= word.length(); i++)
		{
			 System.out.println(word.substring(0));
		}
	}
	
}