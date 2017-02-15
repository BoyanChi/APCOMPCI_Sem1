public class toy
{
	private String toy;
	private int count;

	public toy()
	{
		this.name = "";
		this.count = 1;
	}
	public toy(String n)
	{
		this.name = n;
		this.count = 1;
	}
	public String getName()
	{
		return name;
	}
	public int getCount()
	{
		return count;
	}
	public void setName(String n)
	{
		this.name = n
	}
	public void setCount(Int t)
	{
		this.count = c;
	} 
	abstract class getType()
	{
		return type;
	}
	public String toString()
	{
		return """ + name + "\t" + count + """; 
	}
}