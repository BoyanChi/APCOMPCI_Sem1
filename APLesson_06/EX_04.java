import java.util.Scanner;
public class EX_04
{
		
	public static void main(String[]args)
	{
		EX_04 form = new EX_04();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int num = keyboard.nextInt();
		System.out.println("Please enter the size of your table.");
		int size = keyboard.nextInt();
		System.out.println("number    |      result");
		for(int i = 1; i <= size;  i++)
		{
			int c = i*num;
			form.format(num, c);
		}
	}
	static int c;
	public void format(int num, int c)
	{
		System.out.printf("\n*%5d\t| %5d", num, c);
	}
}	