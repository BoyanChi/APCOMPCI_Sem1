import java.util.Scanner;
public class Exercise_01
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Exercise_01 perimeter = new Exercise_01();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's the length of the rectangle in feet?");
		l = keyboard.nextDouble();
		
		System.out.println("What's the width of the rectangle in feet?");
		w = keyboard.nextDouble();
		
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = 2*(l+w);
	}
	public static void print()
	{
		System.out.println("Your rectangle is " + perimeter + "ft around.");
	}
}