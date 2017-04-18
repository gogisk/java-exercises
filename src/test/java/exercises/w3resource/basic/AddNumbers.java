/**
 * Java Basic Exercises
 * w3resource.com
 */
package exercises.w3resource.basic;

import java.util.Scanner;

/**
 * @author gogisk
 * Apr 17, 2017 12:35:11 AM
 */
public class AddNumbers 
{
	/**
	 * Write a Java program to print the sum of two numbers.
	 * @param args
	 */
	public static void main(String[] args)
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the first number: ");
			int i = scan.nextInt();
			System.out.print("Enter the second number: ");
			int j = scan.nextInt();
			System.out.println("\nANSWER: \nSum of "+i+" and "+j+" is "+ (i+j) );
			scan.close();
		}
		catch (Exception e)
		{
			System.out.println("[Error] #"+e);
		}
	}
}
