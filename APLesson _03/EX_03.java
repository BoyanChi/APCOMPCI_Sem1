import java.util.Scanner; //import Statement

public class EX_03
{
	public static void main(String [] args)
	{
		
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		
		//prompts for user input
		System.out.println("Please tell me your height in meters.");
		
		//search for the next integer that the user enters
		int t = keyboard.nextInt();
	
		double height = t*3.28;
		
		System.out.println("your height is" + " " + height + " " + "in feet.");
		
		
	}	
		
}