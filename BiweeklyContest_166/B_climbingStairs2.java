package BiweeklyContest_166;

import java.util.Arrays;

public class B_climbingStairs2 {
	
	public int solve(int ind, int[] costs, int[] dp, int n){

        if(ind > n){

            return (int) 1e9;
        }

        if(ind == n){

            return 0;
        }

        if(dp[ind] != -1)     return dp[ind];

        int op1 = (int) 1e9, op2 = (int) 1e9, op3 = (int) 1e9;

        if(ind + 1 <= n)   op1 = costs[ind + 1 - 1] + 1 + solve(ind + 1, costs, dp, n);
        if(ind + 2 <= n)   op2 = costs[ind + 2 - 1] + 4 + solve(ind + 2, costs, dp, n);
        if(ind + 3 <= n)   op3 = costs[ind + 3 - 1] + 9 + solve(ind + 3, costs, dp, n);

        return dp[ind] = Math.min(op1, Math.min(op2, op3));
    }
    
    public int climbStairs(int n, int[] costs) {

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return solve(0, costs, dp, n);
    }
}
