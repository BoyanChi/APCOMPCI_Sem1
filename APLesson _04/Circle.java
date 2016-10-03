import java.util.Scanner;
public class Circle
{	
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's the radius of your circle?");
		double r = keyboard.nextDouble();
		    
			
		print(calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		return 3.14*r;
	}
	public static void print(double area)
	{
		
		
		System.out.println("The surface area of a cube with " + "return r;" + " sides is " + area);
		
	}
}