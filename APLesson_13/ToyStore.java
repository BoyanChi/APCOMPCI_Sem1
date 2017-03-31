import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore
{
	private ArrayList<Toy> toyList ;
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
		loadToys("");
	}
	public ToyStore(String t)
	{
		toyList = new ArrayList<Toy>();
		loadToys(t);
	}
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		String name;
		for(int i = 0; i < toys.size(); i += 2)
		{
			name = toys.get(i);
			String type = toys.get(i+1);
			if (type.equals("AF"))
			{
				AFigure object1 = new AFigure(name);
				if (getThatToy(name))
				{
					object1.setCount(object1.getCount() + 1);
					for(int j = 0; j < toyList.size(); j += 1)
					{
						if(toyList.get(j).getName().equals(object1.getName()))
						{
							toyList.set(j,object1);
						}
					}
				}
				else toyList.add(object1);
			}
			else
			{
				Car Object2 = new Car(name);
				if(getThatToy(name))
				{
					Object2.setCount(Object2.getCount() + 1);
					for(int j = 0; j < toyList.size(); j += 1)
					{
						if(toyList.get(j).getName().equals(Object2.getName()))
						{
							toyList.set(j,Object2);
						}
							
					}
				}
				else toyList.add(Object2);
			 }
		 }
	}
	public boolean getThatToy(String nm)
	{
		 for(Toy object : toyList)
			if (object.getName().equals(nm))
			{
				return true;
			}
			return false;
				
	}
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy object : toyList)
			if(max < object.getCount())
			{
				max = object.getCount();
				name = object.getName();
			}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy object : toyList)
			if(object.getType().equals("Car"))
			{
				cars += 1;
			}
			else if(object.getType().equals("Action Figure"))
			{
				figures += 1;
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
		return toyList.toString();
	}

}