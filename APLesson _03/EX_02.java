import java.util.Scanner; //import Statement

public class EX_02
{
	public static void main(String [] args)
	{

		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Please tell me your height in inches.");
		
		
		double inch = keyboard.nextInt();
		
		
		System.out.println("Please tell me your weight in lbs.");
		
		
		double lb = keyboard.nextInt();
		double BMI = lb/inch/inch*703;
		
		System.out.println("your BMI is" + " " + BMI + ".");
		
		
	}	
		
}