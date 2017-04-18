/**
 * Java Basic Exercises
 * w3resource.com
 */
package exercises.w3resource;

import java.util.Scanner;

/**
 * @author gogisk
 * Apr 18, 2017 12:15:19 AM
 */
public class Circle {

	/**
	 * Write a Java program to print the area and perimeter of a circle.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Radius? ");
			double radius = scan.nextDouble();
			double perimeter = 2 * Math.PI * radius;
			double area = 3.14 * Math.PI * radius;
			System.out.println("\nPERIMETER: "+perimeter);
			System.out.println("AREA: "+area);
			scan.close();
		}
		catch(Exception e) {
			System.out.println("[Error] #"+e);
		}

	}

}
