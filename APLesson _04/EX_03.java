import java.util.Scanner; //import Statement

public class EX_03
{
	public static void main(String[]args)
	{
		EX_03 loan = new EX_03();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's the interest rate?");
		Double interest = keyboard.nextDouble();

		System.out.println("What't the principle you have?");
		Double principle = keyboard.nextDouble();

		System.out.println("What's the number of times the loan is compounded per year?");
		Double number = keyboard.nextDouble();

		System.out. println("What's the life of the loan in years.");
		Double time = keyboard.nextDouble();
		
		System.out.println("Your total monthly payment is $" + loan.payment(interest, principle, number, time));
	}
	public double payment(double r, double p, double n, double t)
	{
		return (p*(Math.pow(1+r/n,n*t)))/(t*12);
	}
}