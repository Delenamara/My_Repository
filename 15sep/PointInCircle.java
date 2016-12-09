//Task 9
public class PointInCircle {
	
	public static void main(String args[]){
		
		double n;
		int x0 = 0;
		int y0 = 0;
		int r = 5;
		int x = 3;
		int y = 1;
		
		n = Math.sqrt((x0-x)*(x0-x)+(y0-y)*(y0-y));
			
			if (n < r) {
				
				System.out.print("The point belongs to the circle");
			
			}
			
			else {
				
				System.out.print("The point does not belong to the circle");
			
			}
	
		}
	
	}
