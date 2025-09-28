package WeeklyContest_469;

public class B_splitArrayWithMinDiff {
	
	public long splitArray(int[] nums) {
        
        int n = nums.length;

        boolean[] inc = new boolean[n];
        boolean[] dec = new boolean[n];
        long[] prefixSum = new long[n];

        long totalSum = 0;

        for(int num : nums){

            totalSum += num;
        }

        inc[0] = true;
        prefixSum[0] = nums[0];

        for(int idx = 1 ; idx < n ; idx++){

            if(inc[idx - 1] == true && nums[idx - 1] < nums[idx]){

                inc[idx] = true;
            }

            else    inc[idx] = false;

            prefixSum[idx] = prefixSum[idx - 1] + nums[idx];
        }

        dec[n - 1] = true;

        for(int idx = n - 2 ; idx >= 0 ; idx--){

            if(dec[idx + 1] == true && nums[idx + 1] < nums[idx]){

                dec[idx] = true;
            }

            else    dec[idx] = false;
        }

        long res = Long.MAX_VALUE;

        for(int idx = 0 ; idx < n - 1 ; idx++){

            if(inc[idx] == true && dec[idx + 1] == true){

                long leftSum = prefixSum[idx];
                long rightSum = totalSum - leftSum;

                res = Math.min(res, Math.abs(leftSum - rightSum));
            }
        }

        if(res == Long.MAX_VALUE)    return -1;
        
        return res;
    }
}
