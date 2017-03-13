public class Honda implements Location
{
	private int id;
	private double[] location;
	public Honda()
	{
		location = new double[2];
		id = (int)(Math.random()*1000000);
	}
	public Honda(double[] l)
	{
		location = new double[2];
		location[0] = l[0];
		location[1] = l[1];
		id = (int)(Math.random()*1000000);
	}
	public int getID()
	{
		return id;
	}
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	public double[] getLoc()
	{
		return location;
	}
}