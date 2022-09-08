package leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6]
		//{9,9,9}
		//{9}
		//{9,8,9}
		int[] digits ={9,9 ,9};
		//output = [1,2,4]
		plusOne(digits);
	}
	
	public static int[] plusOne(int[] digits) {
		if(digits[digits.length-1] == 9) {
			int[] newArr = null;
			
			if(digits[0] < 9) {
				newArr = new int[digits.length];
			}
			else {
				newArr = new int[digits.length+1];
			}
			int count = newArr.length-1;
			boolean hasCarry = false;
			for(int i = digits.length-1; i>=0;i--) {
				count--;
				if(digits[i] == 9) {
					hasCarry = true;
					newArr[count] = 0;
				}
				else if(digits[i] != 9 && hasCarry){
					newArr[count] = digits[i]+1;
					hasCarry = false;
				}
				else{
					newArr[count] = 1;
					hasCarry = false;
				}
				
				
				
			}
			for(int ele : newArr) {
				System.out.print(ele);
			}
			
			return newArr;
		}
		else {
			int newNum = digits[digits.length-1] + 1;
			digits[digits.length-1] = newNum;
			for(int ele : digits) {
				System.out.print(ele);
			}
			return digits;
		}
		
		
	}

}
