import java.util.Scanner;
public class Circle
{	
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's the radius of your circle?");
		double r = keyboard.nextDouble();
		    
		double area = Circle.calcArea (r);	
		
		System.out.printf("The surface area of a cube with a radius of %6.5f is %6.5f",r,area);
		
	}
	
	public static double calcArea(double r)
	{
		return 3.14*r;
	}
	
}