package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArrays_H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,2};
		int[] num2 = {3,4};
		
		System.out.print(findMedianSortedArrays(num1, num2));
	}
	
	public static double findMedianSortedArrays(int[] num1, int[] num2) {
		List<Integer> list = new ArrayList<>();
		Arrays.stream(num1).forEach(list::add);
		Arrays.stream(num2).forEach(list::add);
		
		Collections.sort(list);
		int midpt = list.size() / 2;
		
		if(list.size() == 1) {
			return list.get(0).doubleValue();
		}
		if(list.size() == 0) {
			return 0.0;
		}
		else if(list.size()%2 == 0) {//even
			return (double)(list.get(midpt-1) + list.get(midpt)) /2;
		}
		else {// odd
			return list.get(midpt).doubleValue();
		}
	}

}
