/**
 * Java Basic Exercises
 * w3resource.com
 */
package exercises.w3resource;

/**
 * @author gogisk
 * Apr 17, 2017 12:35:11 AM
 */
public class Hello 
{
	/**
	 * Write a Java program to print 'Hello' on screen and then print your name on a separate line.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.print("Hello ");
		System.out.println(System.getProperty("user.name")+"!");
	}
}
