package leetcode;

import java.util.ArrayList;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addDigit(123);
	}
	public static int addDigit(int num) {
		int temp = num;
		int ans = num;
		while(ans < 10) {
			
			ArrayList<Integer> array = new ArrayList<Integer>();
			do{
			    array.add(temp % 10);
			    temp /= 10;
			} while  (temp > 0);
			for(int ele : array) {
				System.out.println(ele);
			}
			
		}
		return ans;
	}
}
