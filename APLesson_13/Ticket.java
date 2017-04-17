public abstract class Ticket
{
	private int serialNo;
	private double Price;
	public Ticket()
	{
		serialNo = (int)(Math.random() * 1234567) + 1;
	}
	public int getSerialNo()
	{
		return serialNo;
	}
	public abstract double getPrice();
	public String tostring()
	{
		return "Serial#: " + this.getSerialNo() + "\nPrice: " + this.getPrice();
	}
}