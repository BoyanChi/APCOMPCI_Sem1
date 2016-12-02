import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class EX_01
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[]args)
	{
		Integer [] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> nums = new ArrayList<> (Arrays.asList(numbers));
		gFactor(nums);
		removePrimes(nums);
	}
	public static int gFactor(int [] nums)
	{
		System.out.println("Please enter a number as parameter");
		int n = keyboard.nextInt(); 
		for (int number : nums)
		{
			if((n % number) == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
	public static void removePrimes(int [] nums)
	{
		for (int i = 0; i <= nums.size; i++)
		{
			if (gFactor(i) = 0)
			{				
				nums.remove(i);
				i -= 1;
			}
		}
		System.out.print(" " + i + " ");	
	}
}