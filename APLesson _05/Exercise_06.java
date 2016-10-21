import java.util.Scanner;
public class Exercise_06
{
	static Scanner keyboard;
	public static void main(String[]args)
	{
		keyboard = new Scanner(System.in);
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("Please set your username.");
		String user = keyboard.next();
		System.out.println("Please set your password.");
		double pass = keyboard.nextDouble();
		System.out.println("Please enter your username.");
		String user1 = keyboard.next();
		System.out.println("Please enter your password.");
		double pass1 = keyboard.nextDouble();
		if (user1.equals(user))
		{
			if(pass1 == pass)
			{
				System.out.println("You are granted access!");
			}
			else
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}
		}
		else
		{
			if(pass1 == pass)
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			else
			{
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
		
		}
	}
}