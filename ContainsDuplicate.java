package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int ele : nums) {
			if(!set.add(ele)) {
				return true;
			}
			set.add(ele);
		}
		return false;
		
	}
}
