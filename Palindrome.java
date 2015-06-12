/**
* This program takes in a string as a command-line argument and determines whether or not
* that string is a palindrome.
*
* @author Lauren Marquez
*/

class Palindrome {

	public static void main(String[] args) {
		String original = args[0];
		String reverse = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		if (reverse.equals(original)) {
			System.out.println(original + " is a palindrome.");
			System.out.println(original + " == " + reverse);
		}
		else {
			System.out.println(original + " is not a palindrome.");
			System.out.println(original + " != " + reverse);
		}
	}
}