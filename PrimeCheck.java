import java.util.Scanner;
import java.lang.Math;

/**
 * This program takes in an integer as a command line argument and determines whether or not it is prime.
 * 
 * @author Lauren Marquez
 */

class PrimeCheck {

	public static boolean isPrime(int number){
        if (number < 3) {
            return number > 1;
        } else {
            int root = (int) Math.ceil(Math.sqrt(number));
            for (int i=2; i <= root; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
	}
	
	public static void main(String[] args) {
        try {
            int input = Integer.parseInt(args[0]);
            if (isPrime(input)) {
                System.out.println("This number is prime.");
            } else {
                System.out.println("This number is not prime.");
            }
        } catch (Exception e) {
            System.out.println("Please enter an integer as a command line argument.");
        }
	}
}