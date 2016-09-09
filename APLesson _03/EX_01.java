import java.util.Scanner; //import Statement

public class EX_01
{
	public static void main(String [] args)
	{
		System.out.println("Hi, my name is RudeAI.");
		System.out.println("I'd like to ask you a few questions.");
		
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		System.out.println(name + "?!!!" + "Why would anyone name a baby that?");
		
		//prompts for user input
		System.out.println("How old are you" + "," + name + "?");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		System.out.println("Oooooo!!!" + num + " " + "is getting up there.");
		
		//prompts for user input
		System.out.println("What do you do for fun, " + name);
		
		String fun = keyboard.next();
		System.out.println("I thought only nerds like to" + " " + fun +".");
		
		//prompts for user input
		System.out.println("What kind of music do you like? ");
		
		String music = keyboard.next();
		System.out.println("Boooo!!! I wouldn't wish the sound of" + " " + music + " " +"on my worst enemy.");
		
		
		//prompts for user input
		System.out.println("How many siblings do you have?");
		
		//search for the next integer that the user enters
		int siblings = keyboard.nextInt();
		System.out.println( siblings + "?" + " " +"Wow, I hope the rest of your family is better looking.");
		
		//prompts for user input
		System.out.println("What do you want to be when you grow up? ");
		
		String be = keyboard.next();
		System.out.println("I think you'd have to be smarter to be a" + " " + be);
		
		System.out.println("So" + " " + name + "," + "you're" + " " + num + "...");
		System.out.println("You like to" + " " + fun + " " + "listen to" + " " + music + "...");
		System.out.println("Good luck becoming a" + " " + be + ".");
		System.out.println("I'm only kiddin'" + " " + name + ".");
	}	
}