package leetcode;

public class IntersectionOfTwoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		while(headB != null) {
			ListNode temp = headA;
			while(temp != null) {
				if(temp == headB) {
					return headB;
				}
				temp = temp.next;
			}
			headB = headB.next;
		}
		return null;
	}
}
