import java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	public MilesPerHour(int d, int h, int min)
	{
		distance = d;
		hours = h;
		minutes = min;
	}
	public void setvalues(int d, int h, int min)
		{
		distance = d;
		hours = h;
		minutes = min;
	}
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
}

