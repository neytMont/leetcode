package leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2};
		System.out.print(removeDuplicates(nums));
	}
	
	public static int removeDuplicates(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(i < nums.length -1 && nums[i] == nums[i+1]) {
				continue;
			}
			nums[count] = nums[i];
			count++;
		}
		
		return count;
 	}
}
