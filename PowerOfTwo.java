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
			System.out.println("Please enter an integer as a command line argument.");
			System.exit(0);
		}
	}
}