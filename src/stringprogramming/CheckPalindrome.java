package stringprogramming;

public class CheckPalindrome {

	static boolean checkPalindrome(String s) {
		boolean flag = false ;
		for(int i =0; i<s.length()/2 ;i++) {
			if(s.charAt(i)!= s.charAt(s.length()-i-1)) {
				flag = false;

			}
			else {
				flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(checkPalindrome("satasb"));
		System.out.println(checkPalindrome("satas"));
	}
}
