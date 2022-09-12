package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1};
		int m = 1;
		int[] nums2 = {};
		int n = 0;
		
		merge(nums1, m, nums2, n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		List<Integer> list = new ArrayList<>();
		int takeOut = nums1.length - m;
		for(int i = 0; i < nums1.length-takeOut; i++) {
			list.add(nums1[i]);
		}
		for(int ele : nums2) {
			list.add(ele);
		}
		Collections.sort(list);
		for(int i = 0; i < nums1.length; i++) {
			nums1[i] = list.get(i);
		}
		
	}
	

}
