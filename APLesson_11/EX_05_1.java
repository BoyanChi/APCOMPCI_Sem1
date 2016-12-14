import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class EX_05_1
{
	static Scanner keyboard = new Scanner(System.in);
	static int CLIPSIZE = 16;
	static int bulletCount;
	static int shotCount;
	public static void main(String[]args)
	{
		int bulletCount = 96;
		int shotCount = 0;
		String [] clip = new String[CLIPSIZE];
		clip[i] = "i";
		resetClip(clip);
		while (bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action:");
			String action = keyboard.next();
			if (action = "R")
			{
				reload();
			}
			if (action = "S")
			{
				System.out.print(shoot());
			}
		}
		printClip();
	}
	public static void resetClip(String [] clip)
	{
		for(int i = 0; i < clip.length; i++)
			clip.set(i,"[]")
	}
	public static String shoot(String [] clip)
	{
		if(shootCount > 0)
		{
			clip.set(shotCount - 1,"[]")
			shotCount--;
			return "Boom!!!"
		}
		else
		{
			return "Reload!!!"
		}
	}
	public static void reload()
	{
		if(bulletCount >=)
	}
}
		