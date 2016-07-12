package px;

public class sumRootToLeafNumbers {

	 // Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }


	    public int sumNumbers(TreeNode root) {
	        if (root == null){
	            return 0;
	        }
	        return helper(root, 0);
	    }
	    
	    private int helper(TreeNode root, int add){
	        if(root.left == null && root.right == null){
	            return root.val + add;
	        }else if(root.left == null){
	            return helper(root.right,  10 * (root.val+add));
	        }else if(root.right == null){
	            return helper(root.left, 10 * (root.val+add));
	        }else{
	            return helper(root.left, 10 * (root.val+add)) + helper(root.right, 10 * (root.val+add));
	        }
	        
	        
	    }

	}

