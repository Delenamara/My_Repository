	import java.io.*;
	public class PointViewer {
		
	public static void main(String[] args) throws FileNotFoundException {
	
	
		Point p = new Point();
			p.method();
		Calculator c = new Calculator( p );
		
		
		System.out.println(c.getDistance());
		}
}