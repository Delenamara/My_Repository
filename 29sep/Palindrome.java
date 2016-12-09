//Task 30
public class Palindrome {
    public static void main(String[] args) {
		
        if(args.length == 0) 
			System.out.println("Please enter something");
        else System.out.println(isPalindrome(args[0]));
		
    }
 
    private static boolean isPalindrome(String data) {
        
		int dataLen = data.length();
			for(int i = 0; i < dataLen / 2; i++)
				if(data.charAt(i) != data.charAt(dataLen - i - 1))
                return false;
				return true;
		}
	}