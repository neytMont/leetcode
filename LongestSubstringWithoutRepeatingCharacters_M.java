package leetcode;

import java.util.Set;
import java.util.LinkedHashSet;

public class LongestSubstringWithoutRepeatingCharacters_M {
	public static void main(String[] args) {
		String s = "bbbbb";
		System.out.print(lengthOfLongestSubstring(s));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		char[] strArr = s.toCharArray();
		int longest = 0;
		
		for(int i =0 ; i<strArr.length; i++) {
			Set<Character> set = new LinkedHashSet<>();
			set.add(strArr[i]);
			for(int j = i+1; j<strArr.length; j++) {
				if(set.contains(strArr[j])) {
					break;
				}
				set.add(strArr[j]);
			}
			if(longest < set.size()) {
				longest = set.size();
			}
		}
		return longest;
 	}
}
