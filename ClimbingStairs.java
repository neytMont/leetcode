package leetcode;

public class ClimbingStairs {
	public static void main(String[] args) {
		int n = 4;
		System.out.print(climbStairs(n));
	}
	public static int climbStairs(int n) {
		 int[] matrix = new int[n];
	        if (n < 3) {
	            return n;
	        }
	        matrix[0] = 1;
	        matrix[1] = 2;
	        // write your code here
	        for (int i = 2; i < matrix.length; i++) {
	            matrix[i] = matrix[i-1] + matrix[i-2];
	        }
	        return matrix[n-1];
	}
}
