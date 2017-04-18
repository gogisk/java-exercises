/**
 * Java Basic Exercises
 * w3resource.com
 */
package exercises.w3resource.basic;

import java.util.Scanner;

/**
 * @author gogisk
 * Apr 17, 2017 11:50:55 PM
 */
public class ArithmeticOperations2 
{

	/**
	 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
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
			System.out.println("\nANSWER: ");
			System.out.println(firstNum+" + "+secondNum+" = "+(firstNum+secondNum));
			System.out.println(firstNum+" - "+secondNum+" = "+(firstNum-secondNum));
			System.out.println(firstNum+" * "+secondNum+" = "+(firstNum*secondNum));
			System.out.println(firstNum+" / "+secondNum+" = "+(firstNum/secondNum));
			System.out.println(firstNum+" mod "+secondNum+" = "+(firstNum%secondNum));
			scan.close();
		}
		catch(Exception e)
		{
			System.out.println("[Error] #"+e);
		}
	}
}
