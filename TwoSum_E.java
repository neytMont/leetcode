package leetcode;

public class TwoSum_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,5,11};
		int target = 10;
		System.out.print(twoSum(nums, target));
	}
	public static int[] twoSum(int[] nums, int target) {
		
	
		for(int i =0; i<nums.length; i++) {
			for(int j =i+1; j<nums.length; j++) {
				if(nums[i]+nums[j] == target) {
					return new int[] {i,j}; 
				}
			}
		}
		 return new int[] {0,0};
	}
}
