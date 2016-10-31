import java.util.Scanner;
public class EX_02
{
	static int digits = 0;	
	static int average = 0;
	static int number;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number.");
		number = keyboard.nextInt();
		avDigits();
		System.out.println("The average of the digits in" + number + " is" + average);
	}
	public static void avDigits()
	{
		int num = number;
		while (num > 0)
		{
			digits ++;
			average += num % 10;
			num /= 10;
		}
	}
}