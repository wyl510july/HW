package px;

public class maximumProductSubarray {

	public static void main(String[] args) {
		int[] nums = {2,-3,2};
		System.out.println(maxProduct(nums));
	}
	
	public static int maxProduct(int[] nums) {
		int[] min = new int[nums.length];
	    int[] max = new int[nums.length];
	    min[0] = nums[0];
	    max[0] = nums[0];
	        
	    for(int i = 1; i < nums.length; i++){
	       min[i] = Math.min(min[i-1]*nums[i], max[i-1]*nums[i]);
	       min[i] = Math.min(min[i], nums[i]);
	       max[i] = Math.max(min[i-1]*nums[i], max[i-1]*nums[i]);
	       max[i] = Math.max(max[i], nums[i]);
	       }
	    
	    int result = Integer.MIN_VALUE;
	    for(int i = 0; i<nums.length;i++){
	    	result = Math.max(result, max[i]);
	    }
	    return result;
	}
}
