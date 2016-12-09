//Task 20
import java.util.Scanner;

	public class Measures {
		
		public static void main(String args[]){
        
			int n;
			int count = 0;
       
		System.out.print("Enter your number - ");
		
        Scanner sr = new Scanner(System.in);
         
			n = sr.nextInt();
          
		System.out.print("Number " + n + " containes to - " );
        
			if (n > 0){
				
				for(int i = 1; i <= n; i++){
				
				if ((n % i) == 0){
            
					count++;
              
			System.out.print(i + " ");
            
					}
				}
			}	
    
			System.out.print("The number of measures - " + count);
	
		}
	
	}