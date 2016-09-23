import java.util.Scanner; //import Statement

public class EX_01
{
	public static void main(String[]args)
    {
		EX_01 form = new EX_01();
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Please enter item 1:");
		String word1 = keyboard.nextLine();
		
		
		System.out.println("Please enter the price:");
		Double number1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please enter item 2:");
		String word2 = keyboard.nextLine();
		
		
		System.out.println("Please enter the price:");
		Double number2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please enter item 3:");
		String word3 = keyboard.nextLine();
		
		
		System.out.println("Please enter the price:");
		Double number3 = keyboard.nextDouble();
		
		String word4 = "Subtotal:";
		Double number4 = number1+number2+number3;
		
		String word5 = "Tax:";
		Double number5 = number4*0.08;
		
		String word6 = "Total";
		Double number6 = number4+number5;
		
		
		System.out.println("<<<<<<<<<__Receipt__>>>>>>>>>>");
		
		System.out.println("\n");
		form.format(word1, number1);
		
		
		form.format(word2, number2);
		
		
		form.format(word3, number3);
		System.out.println("\n");
	
		form.format(word4, number4);
	
		
		form.format(word5, number5);
		
		
		form.format(word6, number6);
		System.out.println("\n");
		
		
		System.out.println("_____________________________________");
		
		System.out.println("*Thank you for your support*");
		
		
		
		
		
		
		
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n*%17s\t....... %10.2f", word, number);
	}
	
	
}