//Task 14
	class Factorial {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int fact = 1;

		if (n > 0) {

			for (int i = 1; i <=n; i++ ) {

				fact *= i;

			}
			
			System.out.printf("Factorial is %d", fact);

		} else if (n == 0 ) {

			System.out.print("1");

		} else {

			System.out.print("Enter number that is greater than 0");

		}

	}

}