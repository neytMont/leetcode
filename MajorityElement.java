package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums =  {2,2,1,1,1,2,2};
		int[] nums1 = {3,3,4};
		System.out.print(majorityElement(nums1));
	}
	
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int ele : nums) {
			if(map.containsKey(ele)) {
				map.replace(ele, map.get(ele)+1);
			}
			else {map.put(ele, 1);}
		}
		return map.entrySet().stream()
				.max((o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1)
				.get()
				.getKey();
		
	}
}
