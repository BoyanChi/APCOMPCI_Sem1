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
	public String loadToys(String TS)
	{
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(ts.split(", ")))
		String name;
		for(int i = 0, i < toys.size(), i += 1)
		{
			name = toys.get(i);
			String type = toys.get(i+1);
			if (type.equals("AF");
			{
				AFigure object = new AFigure(name)
				if (getThatToy(name))
				{
					object.setCount(object.gteCount() + 1);
					for(int j = 0; j < toyList.size(); j += 1)
					{
						if(toyList.get(j).getName().equals(object.getName()))
						{
							toyList.set(j,object);
						}
					}
				}
				else toyList.add(object);
			}
			else
			{
				Car Object = New Car(name)
				if(getThatToy(name0))
				{
					Object.setCount(Object.getCount() + 1)
					for(int j = 0; j < toyList.size(); j += 1)
					{
						if(toyList.get(j).getName.equals(Object.getName()))
						{
							toyList.set(j,Object)
						}
							
					}
				}	
			}
		}
	}
	public boolean getThatToy(String nm)
	{
		 for(Toy object : toylist)
			if (object.getName().equals(nm))
			{
				return true;
			}
			else
			{
				return false;
			}
				
	}
	public String getMostFrequentToy(Toy)
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy object : toylist)
			if(max < object.getCount)
			{
				max = object.getCount;
				name = object.getName;
			}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy object : toylist)
			if(object.getType().equals("Car"))
			{
				cars += 1;
			}
			if(object.getType().equals("Action Figure"))
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
	public String toString()
	{
		return toyList.toString;
	}

}