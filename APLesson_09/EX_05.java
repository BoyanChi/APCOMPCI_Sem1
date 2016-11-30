import java.util.Scanner;
public class EX_05
{
	static int [] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray(numbers);
		System.out.print("For the following numbers...");
		printArray(numbers);
		System.out.println("");
		System.out.print("The ");
		getOdds(numbers);
		System.out.print(" are odd numbers");
	}
	public static void fillArray(int [] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void printArray(int [] numbers)
	{
		for(int num : numbers)
		System.out.print(" " + num + " ");
	}
	public static void getOdds(int [] numbers)
	{
		int [] odds = new int[10];
		for(int i = 0; i < numbers.length; i++)
			for(int num : numbers)
			{
				if ((num & 2) == 0)
				odds[i] = num;
			
			}
		System.out.print(" " + odds + " ");
	}
}