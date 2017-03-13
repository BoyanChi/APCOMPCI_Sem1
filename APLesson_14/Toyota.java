public class Toyota implements Location
{
	private int id;
	private double[] location;
	public Toyota()
	{
		id = (int)(Math.random()*1000000);
		location = new double[2];
	}
	public Toyota(String l)
	{
		id = (int)(Math.random()*1000000);
		location = new double[2];
		String[] locs = l.split(", ");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);
	}
	public int getID()
	{
		return id;
	}
	public void move(double x, double y)
	{
		location[0] += 1;
		location[1] += 2;
	}
	public double[] getLoc()
	{
		return location;
	}
}