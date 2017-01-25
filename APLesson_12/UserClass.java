import java.util.Scanner;
public class UserClass
{
	static Scanner keyboard = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	public UserClass()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public UserClass(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public UserClass(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
								"\nLast Name: " + lastName +
								"\nAvatar: " + avatar +
								"\nUser ID#: " + userID;
	}
	public static void main(String[]args)
	{
		System.out.println("Please enter your first name.");
		String fN = keyboard.next();
		System.out.println("Please enter your last name.");
		String lN = keyboard.next();
		System.out.println("Would you like to use a public avatar? (y or n)");
		String decision = keyboard.next();
		if(decision == "n")
		{
			UserClass userclass1 = new UserClass(fN, lN);
			System.out.println("\n" + userclass1 + "\n");
		}
		else
		{
			System.out.println("Please enter your avatar.");
			String av = keyboard.next();
			UserClass userclass1 = new UserClass(fN, lN, av);
			System.out.println("\n" + userclass1 + "\n");
		}
	}

}
