// changing the boundary elements of a valid segment is helpful
// boundary element can be changed to one prev element to bridge two segments
// or we can change it to -1e9 if we donot want to bridge prev segment and just want to increase length of the next segment by 1
// change element to ai-1 or -1e9

// change to -1e9,,,change to prev element,,,,do not make any change

// tc - O(8n)   (2*2*n X 2)

package BiweeklyContest_169;

import java.util.Arrays;

public class C_longestIncSubarrayAfterReplacingAtmostOneEle {
	
	public int solve(int i, int type, int done, int[][][] dp, int[] nums){

        if(i >= nums.length)    return 0;

        if(dp[i][type][done] != -1)         return dp[i][type][done];

        int ans = 1;
        int val = nums[i];

        if(type == 1){

            if(i == 0)      val = (int) -1e9;       // out of bound check
            else            val = nums[i - 1];
        }

        if(i + 1 < nums.length && nums[i + 1] >= val){      // will make changes afterwards or change is already made

            ans = Math.max(ans, 1 + solve(i + 1, 0, done, dp, nums));
        }

        if(done == 0){      // making change now

            ans = Math.max(ans, 1 + solve(i + 1, 1, 1, dp, nums));
        }

        return dp[i][type][done] = ans;
    }

    public int longestSubarray(int[] nums) {

        // dp[i][type][done]
        // i : array being considered from i to n
        // type : change in the first ele of array
        //        1 : v[i] = v[i - 1]
        //        0 : v[i]

        // done : 1 : without change
        //        0 : with a change

        int n = nums.length;
        int[][][] dp = new int[n + 1][2][2];

        for(int[][] row : dp){

            for(int[] row1 : row)       Arrays.fill(row1, -1);
        }

        int ans = 0;

        for(int idx = 0 ; idx < n ; idx++){

            int temp = Math.max(solve(idx, 0, 0, dp, nums), 1 + solve(idx + 1, 0, 1, dp, nums));
            ans = Math.max(ans, temp);
        }

        return ans;
    }
}
