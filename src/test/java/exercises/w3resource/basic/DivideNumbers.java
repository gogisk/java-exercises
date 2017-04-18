/**
 * Java Basic Exercises
 * w3resource.com
 */
package exercises.w3resource.basic;

import java.util.Scanner;

/**
 * @author gogisk
 * Apr 17, 2017 11:27:56 PM
 */
public class DivideNumbers
{

	/**
	 * Write a Java program to divide two numbers and print on the screen.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the Numerator value: ");
			int num = scan.nextInt();
			System.out.print("Enter the Denominator value: ");
			int denom = scan.nextInt();
			System.out.print("\nANSWER: "+num+" / "+denom+" is "+(num/denom));
			scan.close();			
		}
		catch(Exception e)
		{
			System.out.println("[Error] #"+e);
		}
	}

}
