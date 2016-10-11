import java.util.Scanner; //import Statement

public class EX_04
{
	public static void main(String[]args)
	{
		EX_04 volume = new EX_04();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's the height of your box in inches?");
		Double height = keyboard.nextDouble();

		System.out.println("What's the length of your box in inches?");
		Double length = keyboard.nextDouble();

		System.out.println("What's the width of your box in inches?");
		Double width = keyboard.nextDouble();
		
		System.out.println("The volume of your box is" + volume.calcVol(height, length, width));
	}
	public double calcVol(double h, double l, double w)
	{
		return (h*w*l)/1728;
	}
}