/**
 * Java Basic Exercises
 * w3resource.com
 */
package exercises.w3resource.basic;

import java.util.Scanner;

/**
 * @author gogisk
 * Apr 18, 2017 12:21:24 AM
 */
public class Average3Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 3 numbers: ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			double average = (a+b+c)/3.0;
			System.out.println("AVERAGE: "+average);
			scan.close();
			
		}
		catch(Exception e) {
			System.out.println("[Error] #"+e);			
		}

	}

}
