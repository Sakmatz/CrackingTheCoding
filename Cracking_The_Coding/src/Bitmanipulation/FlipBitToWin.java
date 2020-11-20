package Bitmanipulation;


public class FlipBitToWin {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int[] count = new int[2];
        int index = 0;
        int max = 0;
        boolean zero = false;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 1) {
                count[index] ++;
                max = Math.max(max, count[0] + count[1]);
            }
            else {
                zero = true;
                index = index ^ 1;
                count[index] = 0;
            }
        }
        if (zero == true) {
            max ++;
        }
        return max;
    }

	    // Driver code 
	    public static void main(String[] args) 
	    { 
	    	int[] nums = {1,0,1,1,0};
	        // input 1 
	        System.out.println(findMaxConsecutiveOnes(nums)); 
	  
	     
	}  }