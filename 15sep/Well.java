//Task 1
public class Well { 

	public static void main(String[] args) {
		int time = Integer.parseInt(args[0]);

		if ( time > 0) {
			
			System.out.print("Depth of well is " + (9.8 * time) / 2);
			
		} else {
			
			System.out.print("Enter time that is greater than 0");
		}
	}
	
}