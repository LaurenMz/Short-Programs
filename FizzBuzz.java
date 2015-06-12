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