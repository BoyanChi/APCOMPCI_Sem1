import java.util.Scanner;
public class EX_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your starting number:");
		int SN = keyboard.nextInt();
		System.out.println("Please enter your sequence size:");
		int SZ = keyboard.nextInt();
		int [] seq = new int[SZ];
		for(int i = 0; i < seq.length; i++)
		{
			if (i<= 1)
			{
				seq[i] = SN;
			}
			else
			{
				seq[i] = seq[i-2] + seq[i-1];
			}
			System.out.print(seq[i] + " ");
		}
	}
}