package leetcode;

public class AddTwoNumberListNode_M {
	public static void main(String[] args){
		ListNode l1 = new ListNode(2);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		ListNode l2 = new ListNode(5);
		ListNode n5 = new ListNode(6);
		ListNode n6 = new ListNode(4);
		
		l1.next = n2;
		n2.next = n3;
		n3.next = null;
		
		l2.next = n5;
		n5.next = n6;
		n6.next = null;
		
		ListNode ans = addTwoNumbers(l1,l2);
		while(ans.next != null) {
			System.out.print(ans.val);
			ans = ans.next;
		}
		if(ans.next == null) {
			System.out.print(ans.val);
		}
	}
	
	public static class ListNode {
		int val;
	    ListNode next;
	    
	    ListNode() {}
	    
	    ListNode(int val) { 
	    	this.val = val;
	    }
	    ListNode(int val, ListNode next) { 
	    	this.val = val;
	    	this.next = next;
	    }
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode first = new ListNode(0);
		ListNode last = first;
		int div = 0;
		
		while(l1 != null || l2 != null || div > 0){
		    int sum = div;
		    if (l1!=null){
		        sum += l1.val;
		        l1 = l1.next;
		    }
		    if (l2!=null){
		        sum += l2.val;
		        l2 = l2
		        		.next;
		    }
		    div = sum /10;
		    int mod = sum % 10;
		    ListNode node = new ListNode(mod);
		    last.next = node;
		    last = node;
		}
		if (first == last){
		    return first;
		}
		else{
		    return first.next;
		}
	}
}
