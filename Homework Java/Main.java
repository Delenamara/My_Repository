import java.lang.Math;
class  Main {
    public static void main(String[] args) { 
     double r = Double.parseDouble(args[0]);
	 double n = Double.parseDouble(args[1]);
	 double PI;
	 double l = (Math.PI*r*n)/180;
	 PI=l/2*r;
	 
	 System.out.println(PI);
    }
}
