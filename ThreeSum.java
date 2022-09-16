package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<List<Integer>> threeSum(int[] nums){
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);	
		}
		
		for(int i = 0; i < nums.length -2; i++) {
			for(int j = i+1; j<nums.length -1; j++) {
				int target = 0 - nums[i] - nums[j];
				if(map.containsKey(target) && map.get(target) > j) {
					res.add(Arrays.asList(nums[i], nums[j], target));
					j = map.get(nums[j]);
				}
				
			}
			i = map.get(nums[i]);
		}
		return res;
		
	}
}
