import java.util.Scanner;
public class Exercise_04
{
	static double r;
	static double area;
	
	
	public static void main(String[]args)
	{
		Exercise_04 circle = new Exercise_04();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's the radius of your circle?");
		r = keyboard.nextDouble();
	
		
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = 3.14*r;
	}
	public static void print()
	{
		System.out.println("The area of a circle with a radius of " + r + "  is " + area);
	}
}