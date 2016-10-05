import java.util.Random;

public class Exercise_01
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		Scanner kb = new Scanner(System.in);
		
		
		int num = rand.nextInt(6)+1;
		System.out.println("You rolled a " + num);
		
		int num2 = rand.nextInt(6)+1;
		System.out.println("The computer rolled a " + num2);
		
		
		boolean rollDice = num > num2;
		
		if(rollDice)
		
			System.out.println("The winner is you!");
		
		
		if(!rollDice)
		
			System.out.println("The winner is the computer!");
		
		
		
		
	}
	
	
}