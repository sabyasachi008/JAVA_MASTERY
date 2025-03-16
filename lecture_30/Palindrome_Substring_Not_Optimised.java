package lecture_30;

public class Palindrome_Substring_Not_Optimised{
	public static void main(String[] args) {
		String s = "naman";
		
		subString(s);
		
	}
	public static void subString(String s) {
		for(int i = 0; i<s.length(); i++) {
			for(int j = i+1; j<=s.length(); j++) {
				String str = s.substring(i, j);
				
				if(isPalindrome(str) == true) {
					System.out.println(str);
				}
			}
		}
		
	}
	
	public static boolean isPalindrome(String str) {
		
		int start = 0;
		int end = str.length() - 1;
		
		while(start <= end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
		
	}
}
