import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class EX_05_1
{
	static Scanner keyboard = new Scanner(System.in);
	static int CLIPSIZE = 16;
	static int bulletCount;
	static int shotCount;
	static String [] clip;
	public static void main(String[]args)
	{
		int bulletCount = 96;
		int shotCount = 0;
		String [] clip = new String[CLIPSIZE];
		int i;
		clip[i] = "i";
		resetClip(clip);
		while (bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action:");
			String action = keyboard.next();
			if (action == "R")
			{
				reload();
			}
			if (action == "S")
			{
				System.out.print(shoot(clip));
			}
		}
		printClip();
	}
	public static void resetClip(String [] clip)
	{
		for(int i = 0; i < clip.length; i++)
			clip.set(i,"[]");
	}
	public static String shoot(String [] clip)
	{
		if(shotCount > 0)
		{
			clip.set(shotCount - 1,"[]");
			shotCount--;
			return "Boom!!!";
		}
		else
		{
			return "Reload!!!";
		}
	}
	public static void reload()
	{
		if(bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = "*";
		}
	}
	public static void printClip()
	{
		String output;
		output = ("Bullets:" + "\t" + bulletCount + "\n" + "Clip:" + "\t");
		for(int k = 0; k < CLIPSIZE; k++)
			output += k;
		System.out.println(output);
	}
}
		