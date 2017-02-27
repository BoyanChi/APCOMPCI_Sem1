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
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		String name;
		for(int i = 0; i < toys.size(); i += 1)
		{
			name = toys.get(i);
			String type = toys.get(i+1);
			if (type.equals("AF"))
			{
				AFigure object = new AFigure(name);
				if (getThatToy(name))
				{
					object.setCount(object.getCount() + 1);
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
				Car Object = new Car(name);
				if(getThatToy(name))
				{
					Object.setCount(Object.getCount() + 1);
					for(int j = 0; j < toyList.size(); j += 1)
					{
						if(toyList.get(j).getName().equals(Object.getName()))
						{
							toyList.set(j,Object);
						}
							
					}
				}	
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