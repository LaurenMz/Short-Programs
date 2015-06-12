/**
 * Problem: Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.
 *
 * @author Lauren Marquez
 */

class FizzBuzz {

	public static void main(String[] args) {
		for (int i=1; i<101; i++) {
			String result = Integer.toString(i);
			if (i % 3 == 0) result = "Fizz";
			if (i % 5 == 0) {
				if (result == "Fizz") result = "FizzBuzz";
				else result = "Buzz";
			}
			System.out.println(result);
		}
	}
}