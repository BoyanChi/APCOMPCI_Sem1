import java.util.Scanner;
public class HumanDriver
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Please enter your hair color");
		String hair = keyboard.next();
		System.out.println("Please enter your eye color");
		String eye = keyboard.next();
		System.out.println("Please enter your skin color");
		String skin = keyboard.next();
		HumanClass humanclass1 =new HumanClass(hair, eye, skin);
		System.out.println("My info......");
		System.out.println("Hair:\t" + humanclass1.getHair());
		System.out.println("eyes:\t" + humanclass1.getEyes());
		System.out.println("skin:\t" + humanclass1.getSkin());
		System.out.println("Please enter your friend's hair color");
		String fhair = keyboard.next();
		System.out.println("Please enter your friend's eye color");
		String feye = keyboard.next();
		System.out.println("Please enter your friend's skin color");
		String fskin = keyboard.next();
		humanclass1.setHES(fhair, feye, fskin);
		System.out.println("friend's info......");
		System.out.println("Hair:\t" + humanclass1.getHair());
		System.out.println("eyes:\t" + humanclass1.getEyes());
		System.out.println("skin:\t" + humanclass1.getSkin());
	}
}