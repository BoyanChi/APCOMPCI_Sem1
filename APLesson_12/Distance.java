import java.lang.Math.*;
import java.util.Scanner;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	public distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	public distance(int x, int y, int xx, int yy, double distance)
	{
		xOne = x;
		yOne = y;
		xTwo = xx;
		yTwo = yy;
		distance = 0;
	}
	public void setvalues(int x, int y, int xx, int yy, double distance)
		{
		xOne = x;
		yOne = y;
		xTwo = xx;
		yTwo = yy;
		distance = 0;
	}
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}