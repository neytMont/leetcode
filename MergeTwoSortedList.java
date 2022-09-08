package leetcode;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// list1 = [1,2,4], list2 = [1,3,4]
		//Output: [1,1,2,3,4,4]
		ListNode l1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		
		l1.next = n2;
		n2.next = n3;
		n3.next = null;
		
		l2.next = n4;
		n4.next = n5;
		n5.next = null;
		
		ListNode ln = mergeTwoLists(l1,l2);
		
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
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        
        ListNode p1 = list1;
        ListNode p2 = list2;
        
        while(p1 != null && p2 != null) {
        	if(p1.val < p2.val) {
        		p.next = p1;
        		p1 = p1.next;
        	}
        	else {
        		p.next = p2;
        		p2 = p2.next;
        	}
        	p = p.next;
        }
        if(p1 != null) {
        	p.next = p1;
        }
        if(p2 != null) {
        	p.next = p2;
        }
        
        return head.next;
    }

}
