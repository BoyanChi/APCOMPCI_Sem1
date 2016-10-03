import java.util.Scanner;
public class Cube
{	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's the side length of the cube");
		double side = keyboard.nextDouble();
		    
			
		double sa = Cube.calcSurf (num1, num2, num3);
		System.out.printf("The surface area of a cube whose sides are %6.5f in length is %6.5f);
	}
	
	public static double calcSurf(double side)
	{
		return 6*side*side;
	}

}