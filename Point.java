 import java.io.*;
 import java.util.Scanner;
 class Point {
	//все данные
	int x;
	int y;
	int x0;
	int y0;
	
	void method() throws FileNotFoundException{
		File f = new File("C:\\Path.txt");
		Scanner s = new Scanner( f );
		s.useDelimiter(", ");
		x = s.nextInt();
		y = s.nextInt();
		x0 = s.nextInt();
		y0 = s.nextInt();
	}
	
	int getX(){
		return x;
	}
	
	int getY(){
		return y;
	}
	
	int getX0(){
		return x0;
	}
	
	int getY0(){
		return y0;
	}
	
	
	
 }