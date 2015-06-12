/**
 * Problem: Write a program that determines whether a given number is a power of two.
 * Includes a text-based user interface. :)
 *
 * @author Lauren Marquez
 */

class powerOfTwo {

	public static boolean isPowerOfTwo(int i) {
		return (i & (i-1)) == 0;
	}

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			if (isPowerOfTwo(i)) {
				System.out.println(i + " is a power of two.");
			}
			else {
				System.out.println(i + " is NOT a power of two.");
			}
		} catch (Exception e) {
			System.out.println("Please try again and enter an integer as a command line argument.");
			System.exit(0);
		}
	}
}