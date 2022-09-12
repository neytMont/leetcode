package leetcode;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		System.out.print(mySqrt(x));
	}
	public static int mySqrt(int x) {
		if(x == 0) {
			return 0;
		}
		return (int) Math.sqrt(x);
	}

}
