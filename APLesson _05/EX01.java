import java.util.Scanner;
public class EX01
{
		
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your first letter grade of this year?");
		String Score1 = keyboard.next();
		
		System.out.println("What's your second letter grade of this year?");
		String Score2 = keyboard.next();
		
		System.out.println("What's your third letter grade of this year?");
		String Score3 = keyboard.next();
		
		System.out.println("What's your fourth letter grade of this year?");
		String Score4 = keyboard.next();
		
		System.out.println("What's your fifth letter grade of this year?");
		String Score5 = keyboard.next();
		
		System.out.println("What's your sixth letter grade of this year?");
		String Score6 = keyboard.next();
		
		System.out.println("What's your second letter grade of this year?");
		String Score7 = keyboard.next();
		
		double tgpa = calcPoints(Score1) + calcPoints(Score2) +calcPoints(Score3) + calcPoints(Score4) + calcPoints(Score5) + calcPoints(Score6) + calcPoints(Score7);
        double agpa = tgpa/7;

		System.out.println("Your GPA is" + agpa);
		
	}
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		else
			return 0.0;	
	}
}