import java.util.Scanner;
public class Exercise_05
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You are planning on going for a voccation, would you want to go to Africa or Europe?");
		String choice = keyboard.next();
		if (choice.equals("Europe"))
		{
			System.out.println("Would you like to go to Eastern or Western Europe?");
			String Europe = keyboard.next();
			if(Europe.equals("Eastern"))
			{
				System.out.println("Would you like to go to Romania or Croatia?");
				String ECOUNTRY = keyboard.next();
				if(ECOUNTRY.equals ("Romania"))
				{
					System.out.println("You went to Romania and had a great time there.");
				}
				else
				{
					System.out.println("You went to Croatia and had a great time there.");
				}
			}
			else
			{
				System.out.println("Would you like to go to England or France?");
				String ecountry = keyboard.next();
				if(ecountry.equals ("England"))
				{
					System.out.println("You went to England and had a great time there.");
				}
				else
				{
					System.out.println("You went to France and had a great time there.");
				}
			}
		}
		else
		{
			System.out.println("Would you like to go to Northern or Southern Africa");
			String Africa = keyboard.next();
			if(Africa.equals("Northern"))
			{
				System.out.println("Would you like to go to Egypt or Algeria?");
				String ACOUNTRY = keyboard.next();
				if(ACOUNTRY.equals ("Egypt"))
				{
					System.out.println("You went to Egypt and had a great time there.");
				}
				else
				{
					System.out.println("You went to Algeria and had a great time there.");
				}
			}
			else
			{
				System.out.println("Would you like to go to S.Africa or Angola?");
				String acountry = keyboard.next();
				if(acountry.equals ("S.Africa"))
				{
					System.out.println("You went to S.Africa and had a great time there.");
				}
				else
				{
					System.out.println("You went to Angola and had a great time there.");
				}
			}
		
		}
	}
}