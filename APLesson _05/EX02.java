import java.util.Scanner;
public class EX02
{
		
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your height in inch?");
		double inch = keyboard.nextDouble();
		
		System.out.println("What's your weight in lb?");
		double lb = keyboard.nextDouble();

        double BMI = lb/inch/inch*703;

		String condition = calcCondish(BMI);
		System.out.println("Your BMI is" + BMI);
		System.out.println("You are" + condition);
		
	}
	public static String calcCondish(Double BMI)
	{
		if(BMI<=18.5)
			return "Underweight";
		else if(BMI<=24.9)
			return  "normal";
		else if(BMI<=29.9)
			return "Overweight";
		else if(BMI<=34.9)
			return "Obese";
		else if(BMI<=39.9)
			return "Very Obese";
		else
			return "Morbidly Obese";
		
	   
	}
}