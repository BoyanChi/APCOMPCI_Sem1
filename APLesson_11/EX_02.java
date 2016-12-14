import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		String[][]words = new String [4][4];
		for(int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words[i].length; j++)
			{
				System.out.println("Please enter a word:");
				words[i][j] = keyboard.next();
			}
		}
		for(int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t");
				System.out.println("");
			}
		}
	}
}