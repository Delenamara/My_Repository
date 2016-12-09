//Task 28
class StringsCompare {
    public static void main(String[] args) {

        String s1 = args[0];
        String s2 = args[1];
        int len = s1.length();
        int len2 = s2.length();
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        if (len == 0 || len2 == 0) {
            System.out.print("Please enter strings with normal size");
            System.exit(0);
        }

        if (len2 > len) {
            System.out.print("First string can't be smaller than the second one");
            System.exit(0);
        }

        int n = 0;
        for (int i = 0; i < len; i++) {

			if (s1Arr[i] == s2Arr[0]) {
                for (int j = 0; j < len2; j++) {
                    if (i+j < len && s1Arr[i+j] == s2Arr[j]) n++;
                    else break;
                }
                if (n == len2) {
                    System.out.print("First entry index is: " + i);
                    System.exit(0);
                }
				
				else {
                    n = 0;
                }
            }

        }

        System.out.print("String doesn't enter");

    }
}