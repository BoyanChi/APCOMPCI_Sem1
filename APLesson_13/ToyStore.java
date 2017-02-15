import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore
{
	private ArrayList<toy> toyList ;
	public Toystore()
	{
		toyList = new ArrayList<toy>();
		loadToys("");
	}
	public Toystore(String T)
	{
		toyList = new ArrayList<toy>();
		loadToys(T);
	}
	public String loadToys()
	{
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(ts.split(", ")))
		String name;
		for(int i = 0, i < toys.size(), i += 1)
		{
			String name = toys.get(i);
			String type = toys.grt(i+1);
			if String Toy = getThatToy(name);
			{
				if return null
				{
					Toy.add "toy";
				}
				else
				{
					count += 1;
				}
			}
		}
	}
	public boolean getThatToy(String nm)
	{
		 for(int i = 0, i < Toy.length, i++)
			if (Toy[i] == nm)
			{
				return toy
			}
			else
			{
				return null
			}
				
	}
	public String getMostFrequentToy(Toy)
	{
		String name = "";
		int max = 
		for(int i = 0, i < Toy.length, i++)
			if(i < count || i = count || name = Toy[i])
				return name;
	}
	public String getMostFrequentType(Toy)
	{
		int cars = 0;
		int figures = 0;
		for(int i = 0, i < Toy.length, i++)
			if(Toy[i] = Car)
			{
				cars += 1;
			}
			if(Toy[i] = AF)
			{
				figure += 1;
			}
		if(cars > figures)
		{
			return "Cars";
		}
		if(figures > cars)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	public toString()
	{
		return toyList;
	}

}