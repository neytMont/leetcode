package leetcode;

public class ReverseInteger_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int reverse(int x){
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) return 0;
            result = newResult;
            x /= 10;
        }
        return result;
    }

}
