import java.util.Scanner;
public class CarDriver
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Please enter your paint color");
		String paint = keyboard.next();
		System.out.println("Please enter your interior type");
		String interior = keyboard.next();
		System.out.println("Please enter your engine type");
		String engine = keyboard.next();
		System.out.println("Please enter your tire type");
		String tires = keyboard.next();
		CarClass carclass1 = new CarClass(paint, engine, interior, tires);
		System.out.println(" Your vehicle is ready......");
		System.out.println("Paint:\t" + carclass1.getPaint());
		System.out.println("Interior:\t" + carclass1.getInterior());
		System.out.println("Engine:\t" + carclass1.getEngine());
		System.out.println("Tires:\t" + carclass1.getTires());
	}
}