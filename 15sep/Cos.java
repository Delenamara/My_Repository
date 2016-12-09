//Task 8
public class Cos {

    public static void main(String[] args) {

        int count = Integer.parseInt(args[0]);
        double x = Double.parseDouble(args[1]);

        if (count > 0) {
	        double sum = 0;

	        for ( int i = 1; i <= count; i++ ) {

	        	sum = Math.cos(x + sum);

	        }

	        System.out.println(sum);
	        
	    } else {

	    	System.out.print("Enter count that is greater than 0");

	    }

    }

}