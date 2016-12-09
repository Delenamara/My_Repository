//Task 27
//SearchingForSubArray
	
	public class Test2{
    public static void main(String[] args) {

        int[] first = {1,2,3,4,5,6,7,8,9,34,5,3,56,47,34,255,67,845,65,24,7,2,567,678,789,543,2};
        int[] second = {47,34,255};
        int l = first.length;
        int l2 = second.length;

        if (l == 0 || l2 == 0) {
            System.out.print("Array length must be greater than zero");
            System.exit(0);
        }

        if (l < l2) {
            System.out.print("Second array must be smaller than first.\nOtherwise it never enter");
            System.exit(0);
        }

        int k = 0;
        for (int i = 0; i < l; i++) {

            if (first[i] == second[0]) {
                for (int j = 0; j < l2; j++) {
                    if (i+j < l && first[i+j] == second[j]) k++;
                    else break;
                }
                if (k == l2) {
                    System.out.print("First entry index is: " + i);
                    System.exit(0);
                } else {
                    k = 0;
                }
            }

        }

        System.out.print("Array doesn't enter");
    }
}