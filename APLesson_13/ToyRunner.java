import java.util.Scanner;
public class ToyRunner
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[]args)
	{
		AFigure afigure = new AFigure("a figure");
		Car car = new Car("BMW");
		
		System.out.print(afigure);
		System.out.print("\n");
		System.out.print(car);
		
	}
}