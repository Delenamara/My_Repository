public class Tochka {
	public static void main(String args[]){
		double x0, y0, x, y, r, n;
		x0 = 4;
		y0 = 59;
		r = 1;
		x = 100;
		y = 100;
		n = Math.sqrt((x0-x)*(x0-x)+(y0-y)*(y0-y));
	if (n < r) {
		System.out.print("Belongs");
	}
		else {
			System.out.print("Does not belong");
		}
	
	}
	}