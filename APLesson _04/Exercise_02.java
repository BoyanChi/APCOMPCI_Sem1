import java.util.Scanner;
public class Exercise_02
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Exercise_02 average = new Exercise_02();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your first number?");
		num1 = keyboard.nextDouble();
		
		System.out.println("What's your second number?");
		num2 = keyboard.nextDouble();
		
		System.out.println("What's your third number?");
		num3 = keyboard.nextDouble();
		
		average();
		print();
	}
	
	public static void average()
	{
		avg = (num1+num2+num3)/3;
	}
	public static void print()
	{
		System.out.println("The average of " + num1 + "," + num2 + ",and " + num3 + " is " + avg);
	}
}