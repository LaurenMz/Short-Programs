import java.util.Scanner;

class PrimeCheck {

	public static boolean isPrime(int number){
		if (number < 3) {
			return number > 1;
		} 
		int i = 2;
		if (number % 2 == 0) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to check if it is prime: ");
		int input = in.nextInt();
		if (isPrime(input)) {
			System.out.println("This number is prime.");
		} else {
			System.out.println("This number is not prime.");
		}
	}
}