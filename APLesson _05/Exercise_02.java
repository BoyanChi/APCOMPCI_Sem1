import java.util.Scanner;
public class Exercise_02
{
		
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your first item?");
		String Item1 = keyboard.nextLine();
		
		System.out.println("What's the price of it?");
		double Price1 = keyboard.nextDouble();
		
		System.out.println("What's your second item?");
		String Item2 = keyboard.nextLine();
		
		System.out.println("What's the price of it?");
		double Price2 = keyboard.nextDouble();
		
		System.out.println("What's your third item?");
		String Item3 = keyboard. nextLine();
		
		System.out.println("What's the price of it?");
		double Price3 = keyboard.nextDouble();
		
		System.out.println("What's your forth item?");
		String Item4 = keyboard. nextLine();
		
		System.out.println("What's the price of it?");
		double Price4 = keyboard.nextDouble();
		
		boolean discount = (Price1 + Price2 + Price3 + Price4) >= 2000;
		if(discount)
			System.out.println("<<<<<<<<<<<<<Recipt>>>>>>>>>>>>>>>>");
			System.out.println("Discount\t.......15%");
			System.out.println("\n");
			form.format(Item1, Price1);
			System.out.println("\n");
			form.format(Item2, Price2);
			System.out.println("\n");
			form.format(Item3, Price3);
			System.out.println("\n");
			form.format(Item4, Price4);
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("Total\t......." + ((Price1+Price2+Price3+Price4)*0.75));
			System.out.println("_______________________________________________");
			
		if(!discount)
			System.out.println("<<<<<<<<<<<<<Recipt>>>>>>>>>>>>>>>>");
			System.out.println("Discount\t.......0%");
			System.out.println("\n");
			form.format(Item1, Price1);
			System.out.println("\n");
			form.format(Item2, Price2);
			System.out.println("\n");
			form.format(Item3, Price3);
			System.out.println("\n");
			form.format(Item4, Price4);
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("Total\t......." + (Price1+Price2+Price3+Price4));
			System.out.println("_______________________________________________");
			
		
			
		
	}
	public void format(String Item, double Price)
	{
		System.out.printf("\n*%17s\t....... %10.2f", Item, Price);
	}
	
}