package px;

public class minimumDepthOfBinaryTree {

	public class TreeNode{
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x){ 
	    	  val = x;
	     }
   }
	 
	public class Solution {//1st version
	    public int minDepth(TreeNode root) {
	        if (root == null){
	            return 0;
	        }
	        int left = minDepth(root.left);
	        int right = minDepth(root.right);
	        
	        if (left == 0){
	            return right + 1;
	        }else if(right == 0){
	            return left + 1;
	        }else{
	            return Math.min(left, right)+1;
	        }
	    }
	}


	public int minDepth(TreeNode root) {//2nd version
		if (root == null) {
	        return 0;
	    }
	        return getMin(root);
    }
	
	public int getMin(TreeNode root){
		if (root == null) {
			return Integer.MAX_VALUE;
	   }
		if (root.left == null && root.right == null) {
	        return 1;
	   }
		return Math.min(getMin(root.left), getMin(root.right)) + 1;
	}
}

