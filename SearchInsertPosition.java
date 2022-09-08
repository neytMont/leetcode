package leetcode;

public class SearchInsertPosition {
	public static void main(String[] args) {
		//Input: nums = [1,3,5,6], target = 5
		//Output: 2
		int[] nums = {1,3,5,6};
		int target = 7;
		System.out.print(searchInsert(nums, target));
	}
	
	public static int searchInsert(int[] nums, int target) {
		int ans = 0;
		for(int i = 0; i < nums.length; i++ ) {
			if(nums[i] == target) {
				ans = i;
				break;
			}
			if(nums[i] > target) {
				ans = i;
				break;
			}
			if(target > nums[nums.length-1]) {
				ans = nums.length;
				break;
			}
		}
		return ans;
	}
}
