package leetcode;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.print(lengthOfLastWord((s)));
	}
	
	public static int lengthOfLastWord(String s) {
		String[] arr = s.split(" ");
		return arr[arr.length-1].length();
	}
}
