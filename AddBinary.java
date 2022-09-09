package leetcode;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1010";
		String b = "1011";
		System.out.print(addBinary(a,b));
	}
	public static String addBinary(String a, String b) {
		StringBuilder strBld = new StringBuilder();
		int n1 = a.length()-1;
		int n2 = b.length()-1;
		int carry = 0;
		while(n1 >= 0 || n2 >= 0) {
			int sum = 0;
			if(n1 >= 0 && a.charAt(n1) == '1') {
				sum++;
			}
			if(n2 >= 0 && b.charAt(n2) == '1') {
				sum++;
			}
			sum += carry;
			
			carry = (sum >= 2) ? 1:0;
			
			strBld.insert(0, (char)((sum % 2) + '0'));
			n1--;
			n2--;
		}
		if(carry==1) {
			strBld.insert(0, '1');
		}
		return strBld.toString();
	}
}
