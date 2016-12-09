//Task 15
	public class ArithmeticalProgression {

	public static void main(String[] args) {

		int a1 = Integer.parseInt(args[0]);
		int a2 = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		
		if ( k >= 1) {
			int d = a2 - a1;
			int aK = a1+(k -1)*d;

			System.out.printf("Value of k element is %d", aK);

		} else {

			System.out.print("Enter number that is greater than 0");
		}

	}

}