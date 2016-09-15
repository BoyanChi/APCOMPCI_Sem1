import java.util.Scanner; //import Statement

public class EX_03
{
	public static void main(String [] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Please tell me your height in meters.");
		double t = keyboard.nextDouble();
		
	
		double height = t*3.28;
		
		System.out.println("your height is" + " " + height + " " + "in feet.");
		
		
	}	
		
}