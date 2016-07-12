package px;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorder {


	 //Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	      }
	 
	/*public class Solution {//recursive one
	    public List<Integer> postorderTraversal(TreeNode root) {
	        List<Integer> result = new ArrayList<>();
	        if(root == null){
	            return result;
	        }
	        List<Integer> left = postorderTraversal(root.left);
	        List<Integer> right = postorderTraversal(root.right);
	        
	        result.addAll(left);
	        result.addAll(right);
	        result.add(root.val);
	        return result;
	    }
	}*/

	public class Solution {//iterative one
	    public List<Integer> postorderTraversal(TreeNode root) {
	        List<Integer> res = new ArrayList<>();
	        
	        if(root==null){
	            return res;
	        }
	        
	        Stack<TreeNode> stk = new Stack<>();
	        stk.push(root);
	        
	        while(!stk.isEmpty()) {
	            TreeNode temp = stk.peek();
	            if(temp.left==null && temp.right==null) {//a leaf node
	                TreeNode pop = stk.pop();
	                res.add(pop.val);
	            }else{
	                if(temp.right!=null) {
	                    stk.push(temp.right);
	                    temp.right = null;
	                }
	                if(temp.left!=null) {
	                    stk.push(temp.left);
	                    temp.left = null;
	                }
	            }
	        }return res;
	    }
	}
}
