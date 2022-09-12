package leetcode;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(3);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		ListNode ans = deleteDuplicates(head);
		while(ans!=null) {
			System.out.print(ans.val);
			ans = ans.next;
		}
		
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		List<Integer> list = new LinkedList<>();
		if(head == null || head.next == null) {
			return head;
		}
		while(head!= null) {
			if(!list.contains(head.val)) {
				list.add(head.val);
			}
			head = head.next;
		}
		ListNode newHead = null;
		ListNode tail = null;

		for(int i = list.size()-1; i>= 0; i--) {
			newHead = new ListNode(list.get(i));
			newHead.next = tail;
			tail = newHead;
		}
		return newHead;
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

}
