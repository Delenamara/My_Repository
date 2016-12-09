//Task 16
class BinarySystem {

	public static void main(String[] args) {

		int input = Integer.parseInt(args[0]);
		int countOfOne = 0;
		double result = 0;
		int oneNum;
		int countOfIteration = 0;

		if ( input >= 0) {

			while (input != 0) {

				oneNum = input % 2;

				if (oneNum == 1) {

					countOfOne++;

				}

				result += oneNum * Math.pow(10.0,(countOfIteration));
				countOfIteration++;
				input /= 2;

			}
			
			System.out.println("Number in binary system: " + (int) result);
			System.out.print("Count of 1: " + countOfOne);
        	

		} else {

			System.out.println("Enter the number that is greater than 0");

		}

	}

}