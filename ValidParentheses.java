package leetcode;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
//		Input: s = "{[]}"
//		Output: true
		String s = "){";
		System.out.print(isValid(s));
	}
	
	public static boolean isValid(String s) {
		if(s.length() < 2) {
			return false;
		}
		
		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(char ele : arr) {
			if(ele == '(' || ele == '[' || ele == '{' ) {
				stack.push(ele);
			}
			else if(ele == ')' && stack.size() > 0) {
				if(stack.peek() != '(' ) {
					return false;
				}
				else {
					stack.pop();
				}
			} 
			else if(ele == ']' && stack.size() > 0) {
				if(stack.peek() != '[' ) {
					return false;
				}
				else {
					stack.pop();
				}
			} 
			else if(ele == '}' && stack.size() > 0) {
				if(stack.peek() != '{') {
					return false;
				}
				else {
					stack.pop();
				}
			} 
			else {
				return false;
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
