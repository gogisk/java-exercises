/**
 * Java Basic Exercises
 * w3resource.com
 */
package exercises.w3resource.basic;

/**
 * @author gogisk
 * Apr 18, 2017 12:08:48 AM
 */
public class ComputeFormula {

	/**
	 * Write a Java program to compute a specified formula.
	 * @param args
	 */
	public static void main(String[] args) {
		double d = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		float f = (float) d;
		int i = (int) d;
		long l = (long) d;
		short s = (short) d;
		byte b = (byte) d;
		char c = (char) d;
		
		System.out.println("DOUBLE: "+d);
		System.out.println("FLOAT: "+f);
		System.out.println("INT: "+i);
		System.out.println("LONG: "+l);
		System.out.println("SHORT: "+s);
		System.out.println("BYTE: "+b);
		System.out.println("CHAR: "+c);
	}

}
