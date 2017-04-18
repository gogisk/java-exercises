/**
 * Java Basic Exercises
 * w3resource.com
 */
package exercises.w3resource.basic;

import java.util.Scanner;

/**
 * @author gogisk
 * Apr 17, 2017 11:45:17 PM
 */
public class MultiplyNumbers 
{

	/**
	 * Write a Java program that takes two numbers as input and display the product of two numbers.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("Input first number: ");
			int firstNum = scan.nextInt();
			System.out.print("Input second number: ");
			int secondNum = scan.nextInt();
			System.out.print("\nANSWER: "+firstNum+" * "+secondNum+ " = "+(firstNum * secondNum));
			scan.close();
		}
		catch(Exception e)
		{
			System.out.println("[Error] #"+e);
		}

	}

}
