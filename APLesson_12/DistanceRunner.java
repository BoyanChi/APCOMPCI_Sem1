import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number of x1");
		int x1 = keyboard.nextInt();
		System.out.println("Please enter a number of y1");
		int y1 = keyboard.nextInt();
		System.out.println("Please enter a number of x2");
		int x2 = keyboard.nextInt();
		System.out.println("Please enter a number of y2");
		int y2 = keyboard.nextInt();
		Distance object = new Distance(x1, y1, x2, y2);
		System.out.println("distance = " + object.getDist());
		
	}
		
}