package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "MCMXCIV";
		System.out.println(romanToInt(s));
	}
	
	public static int romanToInt(String s) {
		char[] arr = s.toCharArray();
		int ans = 0;
		if(s.length() == 0) {
			return 0;
		}
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		for(int i = 0; i < arr.length; i++) {
			if(i < arr.length-1) {
				for(int k = i+1; k < arr.length;) {
					if(arr[i]=='I' && arr[k]=='V') {
						ans+=4;
						i++;
						break;
					}
					else if(arr[i]=='I' && arr[k]=='X') {
						ans+=9;
						i++;
						break;
					}
					else if(arr[i]=='X' && arr[k]=='L') {
						ans+=40;
						i++;
						break;
					}
					else if(arr[i]=='X' && arr[k]=='C') {
						ans+=90;
						i++;
						break;
					}
					else if(arr[i]=='C' && arr[k]=='D') {
						ans+=400;
						i++;
						break;
					}
					else if(arr[i]=='C' && arr[k]=='M') {
						ans+=900;
						i++;
						break;
					}
					else {
						ans+=map.get(arr[i]);
					}
					break;
				}
			}
			else {
				ans+=map.get(arr[i]);
			}
		}
		return ans;
	}

}
