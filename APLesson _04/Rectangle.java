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
		
		double per = Rectangle.calcPerim(l,w);
		
		System.out.printf("Your rectangle is %6.5f ft around.",per);
		
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	
}