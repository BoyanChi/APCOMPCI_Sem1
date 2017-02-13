public class GameSystem
{
	private String platform
	private int serialNo
	public GameSystem
	{
		this.platform = "";
		this.serialNo = 1;
	}
	public GameSystem(String platform, int serialNo)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 7) + 1;
	}
	public String getplatform()
	{
		return platform;
	}
	public int getserialNo()
	{
		return serialNo;
	}
	
}