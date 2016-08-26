package px;
import java.util.Stack;
public class containerMostWater {

	public static void main(String[] args) {
		int[] matrix = {1, 1};
		System.out.println(maxArea(matrix));

	}
	
	 public static int maxArea(int[] height) {
	            int max = 0; 
	            int left = 0;
	            int right =  height.length - 1;
	            while (left < right){
	               max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
	               if (height[left] <= height[right]) {
	                   left++;
	               }else{
	                   right--;
	               }
	           }
	           return max;
	           
	       }
	    }

