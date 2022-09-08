package leetcode;

public class IsPalindrome {
	public static void main(String[] args) {
		System.out.print(isPalindrome(121));
	}
	public static boolean isPalindrome(int x) {
		String str = Integer.toString(x);
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j){//while there are still some characters
			if(str.charAt(i) != str.charAt(j)){//if there is a mismatch
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
}
