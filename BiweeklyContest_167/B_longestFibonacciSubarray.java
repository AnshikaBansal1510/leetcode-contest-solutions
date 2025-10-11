package BiweeklyContest_167;

public class B_longestFibonacciSubarray {
	
	public int longestSubarray(int[] nums) {

        int n = nums.length;

        if(n <= 2){

            return n;
        }

        int maxLen = 2;
        int len = 2;

        for(int idx = 2 ; idx < n ; idx++){

            if(nums[idx] == (nums[idx - 1] + nums[idx - 2])){

                len++;
            }

            else{
                
                len = 2;
            }

            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}
