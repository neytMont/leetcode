package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ZigzagConversion_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		int num = 3;
		System.out.print(convert(s,num));
	}
	public static String convert(String s, int numRows) {
        if(s.length() == 0 || numRows == 1 || numRows >= s.length()){
            return s;
        }

        char[] res = new char[s.length()];
        int step = 2 * (numRows - 1);
        int count = 0;

        for(int i = 0; i < numRows; i++){
            int interval = step - 2 * i;
            for(int j = i; j < s.length(); j = j + step){
                res[count++] = s.charAt(j);
            
                if(interval < step && interval > 0 && j + interval < s.length() && count < s.length()){
                    res[count++] = s.charAt(j + interval);
                }
            }
        }
        return new String(res);
    }
}
