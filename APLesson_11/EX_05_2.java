import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class EX_05_2
{
	static Scanner keyboard = new Scanner(System.in);
	static String [] health;
	static int HEALTHLOAD = 6;
	static int healthcount;
	public static void main(String[]args)
	{
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthcount = 6;
		String [] health = new String[HEALTHLOAD];
		while(turn != "Q" && healthcount > 0)
		{
			System.out.println("Tour turn! Hit enter when ready:");
			keyboard.nextLine;
			System.out.println("sb");
			int damage = Math.random()*1 + 1;
			int amount = Math.random()*5 + 1;
			System.out.print(takedamage(damage,amount);
			printClip();
		}
		System.out.println("You died!!!");
	}
	public static void takedamage(int damage; int amount);
	{
		if(damage == 1)
		{
			healthCount -= amount;
			return "Taking" + amount + "damage!";
		}
		else
		{
			if(healthcount + amount < HEALTHLOAD)
			{
				healthcount += amount;
			}
			else
			{
				healthcount = HEALTHLOAD;
			}
			return "Power Up" + amount + "!";
		}
	}
	public static void printClip();
	{
		String output = "Health:\t";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthcount)
			{
				health.set(i,"@");
			}
			else
			{
				health.set(i,"[]");
			}
		}
		output = output + health(i);
	}
}