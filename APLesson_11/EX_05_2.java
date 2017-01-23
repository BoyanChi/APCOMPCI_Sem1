import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class EX_05_2
{
	static Scanner keyboard = new Scanner(System.in);
	static String [] health;
	static int HEALTHLOAD = 6;
	static int healthCount;
	public static void main(String[]args)
	{
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
		while(turn != "Q" && healthCount > 0)
		{
			System.out.println("your turn! Hit enter when ready:");
			String set = keyboard.nextLine();
			damage = (int)(Math.random()*1) + 1;
			amount = (int)(Math.random()*5) + 1;
			System.out.println(takedamage(damage, amount));
			printClip();
		}
		System.out.println("You died!!!");
	}
	public static String takedamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount -= amount;
			return "Taking " + amount + " damage!";
		}
		else
		{
			if(healthCount + amount < HEALTHLOAD)
			{
				healthCount += amount;
			}
			else
			{
				healthCount = HEALTHLOAD;
			}
		}
		return "Power Up " + amount + " !";
	}
	public static void printClip()
	{
		String output = "Health:\t";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
			}
			output = output + health[i];
		}
		System.out.println(output);
	}
}