/*Author  : Krishna Rana
 * Date   : 5/30/2017
 * Purpose: The purpose of this class Payroll is to describe the needed
 * 			methods to perform task to calculate the payroll.
 */

/**
 * Payroll class
 * This class sets name, id, rate, hours worked.
 * and sets the parameters to be used to calculate the gross pay.
 */
public class Payroll
{
	//declaration
	private String name;
	private int id;
	private double hourRate;
	private double hourWork;
	
	/**
	 * Constructor
	 * @param N
	 * @param Id
	 */
	public Payroll(String N, int Id)
	{
		name = N;
		id = Id;
	}
	/**
	 * The setrate sets hourRate to rate, when an argument is given
	 * @param rate
	 */
	public void setrate(double rate)
	{
		hourRate = rate;
	}
	/**
	 * The sethours sets hourWork to worked, when an argument is given
	 * @param worked
	 */
	public void sethours(double worked)
	{
		hourWork = worked;
	}
	/**
	 * The getname return the value stored in name.
	 * @return name
	 */
	public String getname()
	{
		return name;
	}
	/**
	 * The getid return the value stored in id
	 * @return id
	 */
	public int getid()
	{
		return id;
	}
	/**
	 * The getrate return the value stored in hourRate
	 * @return hourRate
	 */
	public double getrate()
	{
		return hourRate;
	}
	/**
	 * The getwork return the value stored in hourWork
	 * @return hourWork
	 */
	public double getwork()
	{
		return hourWork;
	}
	/**
	 * The getgross returns name the value stored by 
	 * multiplying hourRate with hourWork.
	 * @return grosspay = rate * worked hours
	 */
	public double getgross()
	{
		return hourRate * hourWork;
	}	
}




