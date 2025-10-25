package BiweeklyContest_168;

import java.util.Arrays;

public class D_countWaysToChooseCoPrime {

	int mod = (int) (1e9 + 7);

	public int gcd(int a, int b){
		
		while (b != 0) {
			
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		return a;
	}

	public long solve(int row, int curr, int n, long[][] dp, int[][] mat){

		if(row == n){

			if(curr == 1){

				return 1;
			}

			return 0;
		}

		if(dp[row][curr] != -1){

			return dp[row][curr];
		}

		long ways = 0;

		for(int num : mat[row]){

			int latest = gcd(curr, num);

			ways = (ways + solve(row + 1, latest, n, dp, mat)) % mod;
		}

		return dp[row][curr] = ways;
	}
	
	public int countCoprime(int[][] mat){

		int n = mat.length;
		int m = mat[0].length;
		
		long[][] dp = new long[n][151];

		for(long[] row : dp){

			Arrays.fill(row, -1);
		}

		long ans = 0;

		for(int num : mat[0]){
			
			ans = (ans + solve(1, num, n, dp, mat)) % mod;
		}

		return (int) ans;
	}
}
