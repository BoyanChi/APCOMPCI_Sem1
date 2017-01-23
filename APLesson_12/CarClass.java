public class CarClass
{
	private String paint, engine, interior, tires;
	public CarClass()
	{
		paint = "";
		engine = "";
		interior = "";
		tires = "";
	}
	public CarClass(String p, String e, String i, String t)
	{
		paint = p;
		engine = e;
		interior = i;
		tires = t;
	}
	public void setCustom(String p, String e, String i, String t)
	{
		paint = p;
		engine = e;
		interior = i;
		tires = t;
	}
	public String getPaint()
	{
		return paint;
	}
	public String getEngine()
	{
		return engine;
	}
	public String getInterior()
	{
		return interior;
	}
	public String getTires()
	{
		return tires;
	}
	
}
