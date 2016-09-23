import java.util.Scanner; //import Statement

public class EX_02
{
	public static void main(String[]args)
    {
		EX_02 form = new EX_02();
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter your first name:");
		String primary1 = keyboard.nextLine();
		
		System.out.println("Enter your last name:");
		String secondary1 = keyboard.nextLine();
		
	
		System.out.println("Enter your title:");
		String primary2 = keyboard.nextLine();
		
		
		System.out.println("Enter the school site");
		String primary3 = keyboard.nextLine();
	
		System.out.println("Enter the school year");
		String secondary3 = keyboard.nextLine();
		
		
		System.out.println("What is your subject?");
		String secondary2 = keyboard.nextLine();
		
		
				
		System.out.println("*********************************************");
		
		form.format(primary3, secondary3);
		
		form.format(primary1, secondary1);
		
		form.format(primary2, secondary2);
		
		System.out.println("\n");
		
		System.out.println("*********************************************");
		
		
		
		
	}
	
	
		
	
	public void format(String primary, String secondary)
	{
	     System.out.printf("\n*\t%15s\t%25s*", primary, secondary);
	}
		
}