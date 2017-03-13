public class GMC implements Location
{
	private int id;
	private double[] location;
	public GMC()
	{
		location = new double[2];
		id = (int)(Math.random()*1000000);
	}
	public GMC(double x, double y)
	{
		location = new double[2];
		location[0] = x;
		location[1] = y;
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