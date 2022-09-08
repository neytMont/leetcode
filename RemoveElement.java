package leetcode;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input: nums = [3,2,2,3], val = 3
		// Output: 2, nums = [2,2,_,_]
		int[] nums = {3,2,2,3};
		int val = 3;
		System.out.print(removeElement(nums,val));
	}
	public static int removeElement(int[] nums, int val) {
		int count = 0;
		//loop the array, find the element thats not equals the val,
		//put it on first available index, count++

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}

}
