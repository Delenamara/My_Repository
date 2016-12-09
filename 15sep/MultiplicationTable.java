//Task 12
	public class MultiplicationTable{
		public static void main(String[] args){
			
			int n = Integer.parseInt(args[0]);
			
			int[][] multiplyTab  = new int[100][100];

			for (int i = 0; i < n; i++) {
			
				for (int j = 0; j < n; j++) {
			
				multiplyTab[i][j] = (i+1)*(j+1);
			
				System.out.print(multiplyTab[i][j] + "\t");
				}
   
			System.out.println();
			}
		}
	}