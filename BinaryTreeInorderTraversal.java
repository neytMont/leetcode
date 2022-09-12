package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		
	}

	public static List<Integer> inorderTraversal(TreeNode root){
		List<Integer> ret = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		
		while(root != null || !stack.empty()) {
			if(root == null) {
				TreeNode curNode = stack.pop();
				ret.add(curNode.val);
				root = curNode.right;
			}
			else {
				stack.push(root);
				root = root.left;
			}
		}
		return ret;
	}
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) {
			this.val = val; 
		}
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
