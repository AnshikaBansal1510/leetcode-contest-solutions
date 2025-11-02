package WeeklyContest_474;

import java.util.Arrays;

public class B_maxProdOfThreeElements {
	
	public long maxProduct(int[] nums) {

        int n = nums.length;

        for(int idx = 0 ; idx < n ; idx++){

            nums[idx] = Math.abs(nums[idx]);
        }

        Arrays.sort(nums);

        return (100000L * nums[n - 1] * nums[n - 2]);
    }
}
