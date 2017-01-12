import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a distance in miles");
		int distance = keyboard.nextInt();
		System.out.println("Please enter a number of hours");
		int hours = keyboard.nextInt();
		System.out.println("Please enter a number of minutes");
		int minutes = keyboard.nextInt();
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		System.out.println(distance + "miles in" + hours + "hours " + minutes + "minutes" + "\t= " + object.getMPH() + " mph");	
	}
		
}