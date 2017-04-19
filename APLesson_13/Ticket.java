public abstract class Ticket
{
	private int serialNo;
	private double Price;
	public Ticket()
	{
		
	}
	public int getSerialNo()
	{
		return (int)(Math.random()*10000000) + 1;
	}
	public abstract double getPrice();
	public String tostring()
	{
		return "Serial#: " + this.getSerialNo() + "\nPrice: " + this.getPrice();
	}
}