package Arrays;

public class Max_Element_in_Array {
	  public static void main(String[] args) {
	        int[] nums = {23, 54, 12, 67, 89};
	        int max = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] > max) {
	                max = nums[i];
	            }
	        }

	        System.out.println("Maximum value: " + max);
	    }

}
