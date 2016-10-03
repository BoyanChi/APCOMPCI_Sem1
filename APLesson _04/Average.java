import java.util.Scanner;
public class Average
{	
		
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your first number?");
		double num1 = keyboard.nextDouble();
		
		System.out.println("What's your second number?");
		double num2 = keyboard.nextDouble();
		
		System.out.println("What's your third number?");
		double num3 = keyboard.nextDouble();
		
		double avg = Average.average (num1, num2, num3);
		
		System.out.printf("The average of %6.5f\t,%6.5f\t,and %6.5f is %6.5f",num1,num2,num3,avg);
	}
	
	public static double average(double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3;
	}
	
}