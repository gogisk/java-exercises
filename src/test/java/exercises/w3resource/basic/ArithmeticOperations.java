/**
 * Java Basic Exercises
 * w3resource.com
 */
package exercises.w3resource.basic;

import java.util.Scanner;

/**
 * @author gogisk
 * Apr 17, 2017 11:33:57 PM
 */
public class ArithmeticOperations 
{

	/**
	 * Write a Java program to print the result of the following operations.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("ARITHMETIC OPERATIONS: \nChoose an option from the following:");
			System.out.println("1. -5 + 8 * 6");
			System.out.println("2. (55+9) % 9 ");
			System.out.println("3. 20 + -3*5 / 8");
			System.out.println("4. 5 + 15 / 3 * 2 - 8 % 3");

			System.out.print("Option Chosen: ");
			
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			
			System.out.println("\nANSWER: ");
			if(i==1) System.out.println(-5 + 8 * 6);
			else if(i==2) System.out.println((55+9) % 9);
			else if(i==3) System.out.println(20 + -3*5 / 8);
			else if(i==4) System.out.println(5 + 15 / 3 * 2 - 8 % 3);
			else System.out.println("[Error] Unknown option.");
			
			scan.close();			
		}
		catch(Exception e)
		{
			System.out.println("[Error] #"+e);
		}

	}

}
