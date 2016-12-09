//Task 21
class LeastCommonMultiple{

	public static void main(String[] args) {

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int a = n1;
		int b = n2;
		
		if (n1 < 0 || n2 < 0) {

			System.out.print("Enter number that is greater than 0");

		} else {

			while (n1 != 0 && n2 != 0) {

				if ( n1 > n2) {

					n1 %= n2;

				} else {

					n2 %= n1;

				}

			}

		}

		System.out.print((a*b)/(n1+n2));
		
	}
	
}