import java.util.Scanner;
public class Exercise_03
{
	static double side;
	static double sa;
	
	
	public static void main(String[]args)
	{
		Exercise_03 cube = new Exercise_03();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's the side length of the cube");
		side = keyboard.nextDouble();
	
		
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = 6*side*side;
	}
	public static void print()
	{
		System.out.println("The surface area of a cube with " + side + " sides is " + sa);
	}
}