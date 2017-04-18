/**
 * Java Basic Exercises
 * w3resource.com
 */
package exercises.w3resource;

import java.util.Scanner;

/**
 * @author gogisk
 * Apr 17, 2017 11:57:06 PM
 */
public class MultiplicationTable_10 
{

	/**
	 * Write a Java program that takes a number as input and prints its multiplication table upto 10.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("Input a number: ");
			int firstNum = scan.nextInt();
			System.out.println("\nOUTPUT: ");
			
			for(int i=1; i<=10; i++)
			{
				System.out.println(firstNum+" x "+i+" = "+(firstNum*i));
			}
			scan.close();
		}
		catch(Exception e)
		{
			System.out.println("[Error] #"+e);
		}
	}

}
