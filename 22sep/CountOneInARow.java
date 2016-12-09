//Task 19
class CountOneInARow {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int countOfOne = 0;
		int oneNum;
		int max = 0;

		if ( n > 0) {

			while (true) {

				if (n <= 0) break;

				oneNum = n % 2;

				if (oneNum == 1) countOfOne++;

				if (oneNum == 0) {

					if (countOfOne > max) {

						max = countOfOne;

					}

					countOfOne = 0;
				}

				n /= 2;
			}

			System.out.print("Max 1 of number in binary system is " + max);

		} else {

			System.out.print("Enter the number that is greater than 0");
			
		} 

		
	}

}