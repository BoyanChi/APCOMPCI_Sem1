import java.util.Scanner;
public class Exercise_02
{
		
	public static void main(String[]args)
	{
		Exercise_02 form = new Exercise_02();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your first item?");
		String Item1 = keyboard.nextLine();
		
		System.out.println("What's the price of it?");
		double Price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("What's your second item?");
		String Item2 = keyboard.nextLine();
		
		
		System.out.println("What's the price of it?");
		double Price2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("What's your third item?");
		String Item3 = keyboard. nextLine();

		
		System.out.println("What's the price of it?");
		double Price3 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("What's your forth item?");
		String Item4 = keyboard. nextLine();
		
		
		System.out.println("What's the price of it?");
		double Price4 = keyboard.nextDouble();
		
		String Item5 = "Subtotal";
		
		double Price5 = Price1 + Price2 + Price3 + Price4;
		
		String Item6 = "Discount"; 
		
		double Price6 = discount(Price5);
		
		String Item7 = "Tax";

		double Price7 = (Price1 + Price2 + Price3 + Price4)*0.065;
		
		String Item8 = "total";
		
		double Price8 = Price5 - Price6 + Price7;
		
	
		
		
		
		
		System.out.println("<<<<<<<<<<<<<Recipt>>>>>>>>>>>>>>>>");
		System.out.println("\n");
		form.format(Item1, Price1);
		System.out.println("\n");
		form.format(Item2, Price2);
		System.out.println("\n");
		form.format(Item3, Price3);
		System.out.println("\n");
		form.format(Item4, Price4);
		System.out.println("\n");
		form.format(Item5, Price5);
		System.out.println("\n");
		form.format(Item6, Price6);
		System.out.println("\n");
		form.format(Item7, Price7);
		System.out.println("\n");
		form.format(Item8, Price8);
		System.out.println("\n");
		System.out.println("_______________________________________________");
		System.out.println("\n");
		System.out.println("Thank you");
	}		
		
	static double Price6;		
	static double Price5;	
	public static double discount(double price5)
	{
		if (Price5>= 2000)
		{
			Price6 = Price5*0.15;
		}
		if (Price5< 2000)
		{		
	 		Price6 = 0;
		}
		return Price6;
	}	
		
	
	public void format(String Item, double Price)
	{
		System.out.printf("\n*%17s\t....... %10.2f", Item, Price);
	}
	
}