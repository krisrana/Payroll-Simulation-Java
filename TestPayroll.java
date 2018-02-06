/*Author  : Krishna Rana
 * Date   : 5/30/2017
 * Purpose: The purpose of this class Payroll is to describe the needed
 * 			methods to perform task to calculate the payroll.
 */

//importing Scanner utility
import java.util.Scanner;
/**
 * TestPayroll class
 * This class sets name, id, rate, hours worked to the methods in class Payroll.
 * and the parameters are used to calculate the gross pay. This class also
 * Displays all the information in output display.
 */
public class TestPayroll
{
	/**
	 * main class
	 * This class has step by step instructions to run the program
	 */
	public static void main(String[] args) 
	{
		//local declarations
		String name;
		int id;
		double hours;
		double rate;
		
		System.out.println("INPUT FROM USER\n");
		
		//using scanner utility to get input from user
		Scanner input = new Scanner(System.in);
		
		//prompt message to get input of Name
		System.out.print("Enter the Name of the Employee: ");
		name = input.nextLine();
		
		//prompt message to get input of id
		System.out.print("Enter the Id of the Employee: ");
		id = input.nextInt();
		
		//creating new class object and passing Name and Id
		Payroll output = new Payroll(name, id);
		
		//prompt message to get input of hours worked
		System.out.print("Enter the hours worked: ");
		hours = input.nextDouble();
		//setting hours to hourWork in class Payroll
		output.sethours(hours);
		
		//prompt message to get input of pay rate
		System.out.print("Enter the pay rate for Employee: ");
		rate = input.nextDouble();
		//setting rate to hourRate in class Payroll
		output.setrate(rate);
			
		//output
		System.out.println("\nOUTPUT ON DISPLAY\n");

		//This statements displays the user input
		//it also shows the calculated gross pay of an employee
		System.out.println("The name of the Employee is     : " + output.getname() );
		System.out.println("The Id of the Employee is       : " + output.getid());
		System.out.println("Total Number of hours worked    : " + output.getwork() + " hour's");
		System.out.println("Payrate for the employee is     : $" + output.getrate() + " /hour");
		System.out.println("The Gross Pay of the Employee is: $" + output.getgross());
		
		input.close();
				
	}

}
