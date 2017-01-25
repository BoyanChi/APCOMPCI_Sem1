import java.util.Scanner;
public class InventoryItems
{
	static Scanner keyboard = new Scanner(System.in);
	private String manufacture;
	private String name;
	private String category;
	private int UPC;
	private double price;
	public InventoryItems()
	{
		manufacture = "";
		name = "";
		category = "";
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = 0;
	}
	public InventoryItems(String m, String n)
	{
		manufacture = m;
		name = n;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	public InventoryItems(String m, String n, String c, double p)
	{
		manufacture = m;
		name = n;
		category = c;
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = p;
	}
	public String toString()
	{
		return "Item Info...\n manufacture: " + manufacture +
								"\n name: " + name +
								"\n category: " + category +
								"\n UPC#: " + UPC +
								"\n price: " + price;
	}
	public static void main(String[]args)
	{
		System.out.println("Please enter the manufacture of the item");
		String m = keyboard.next();
		System.out.println("Please enter the name of the item");
		String n = keyboard.next();
		System.out.println("Would you like to category and price information.(y or n)");
		String decison = keyboard.next();
		if(decison == "n")
		{
			InventoryItems inventoryitems1 = new InventoryItems(m, n);
			System.out.println("\n" + inventoryitems1 + "\n");
		}
		else
		{
			System.out.println("Please enter the category of the item");
			String c = keyboard.next();
			System.out.println("Please enter the price of the item");
			double p = keyboard.nextDouble();
			InventoryItems inventoryitems1 = new InventoryItems(m, n, c, p);
			System.out.println("\n" + inventoryitems1 + "\n");
		}
	}
}

