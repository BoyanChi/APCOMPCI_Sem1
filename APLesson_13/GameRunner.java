public class GameRunner
{
	public static void main(String[]args)
	{
		XBox xbox = new XBox("XBox");
		PlayStation ps = new PlayStation("PlayStation");
		PC pc = new PC("PC");
		System.out.println("\n");
		System.out.println(xbox);
		System.out.println("\n");
		System.out.println(ps);
		System.out.println("\n");
		System.out.println(pc);
	}
}