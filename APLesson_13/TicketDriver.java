public class TicketDriver
{
	public static void main(String[]args)
	{
		Advance advance = new Advance(15);
		StudentAdvance student = new StudentAdvance(15);
		Walkup walkup = new Walkup();
		
		System.out.println(advance);
		System.out.println("\n");
		System.out.println(student);
		System.out.println("\n");
		System.out.println(walkup);
		System.out.println("\n");
	}
}