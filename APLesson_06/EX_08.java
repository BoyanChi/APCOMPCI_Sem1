public class EX_08
{
		
	public static void main(String[]args)
	{
		sing("Na", 4);
		System.out.println("");
		sing("Na", 4);
		System.out.println("");
		sing("Hey", 3);
		System.out.println("");
		sing("Goodbye!", 1);
		
	}
	public static void sing(String word, int num)
	{
		for(int i = 1; i <= num; i++)
		{
			System.out.print(" " + word + " ");
		}
	}
}
		
		