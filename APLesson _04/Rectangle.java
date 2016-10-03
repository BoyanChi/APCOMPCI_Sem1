import java.util.Scanner;
public class Rectangle
{	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's the length of the rectangle in feet?");
		double l = keyboard.nextDouble();
		
		System.out.println("What's the width of the rectangle in feet?");
		double w = keyboard.nextDouble();
		
		print(calcPerim(l,w));
		
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	public static void print(double perimeter)
	{
		System.out.println("Your rectangle is " + perimeter + "ft around.");
	}
}