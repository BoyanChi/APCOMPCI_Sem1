import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class EX_02
{
	static int i = 0;
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Please enter an equation.");
		String formula = keyboard.nextLine();
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(formula.split(" ")));
		doequation(equation);
	}
	public static void doequation(ArrayList<String>equation)
	{
		while(i < equation.size())
		{
			if (equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if (equation.get(i).equals("*"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				else
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
			}
			else
			{		
				i += 1;
			}
		
		}
		while(i < equation.size())
		{
			if (equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if (equation.get(i).equals("+"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				else
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
			}
			else
			{		
				i += 1;
			}
		}
		System.out.println(equation);
	}
}