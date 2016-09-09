import java.util.Scanner; //import Statement

public class EX_02
{
	public static void main(String [] args)
	{

		
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("Please tell me your height in meters.");
		
		//search for the next integer that the user enters
		int meters = keyboard.nextInt();
		
		
		System.out.println("Please tell me your weight in kilograms.");
		
		//search for the next integer that the user enters
		int kilograms = keyboard.nextInt();
		int BMI = kilograms/meters/meters;
		
		System.out.println("your BMI is" + " " + BMI + ".");
		
		
	}	
		
}