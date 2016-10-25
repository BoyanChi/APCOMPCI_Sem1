import java.util.Scanner;
public class EX_05
{
		
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your first number.");
		int num1 = keyboard.nextInt();
		System.out.println("Please enter your second number");
		int num2 = keyboard.nextInt();
		for(int i = num1; i <= num2; i+=2)
		{
			System.out.print(i + " ");
		}
	}
}