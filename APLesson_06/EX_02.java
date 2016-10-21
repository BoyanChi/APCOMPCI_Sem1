import java.util.Scanner;
public class EX_02
{
		
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int num = keyboard.nextInt();
		int fac = 1;
		
		for(int i = 1 ;i <= num; i++)
		{
			System.out.println("The factorial is" + fac*i);
		}
	}
}