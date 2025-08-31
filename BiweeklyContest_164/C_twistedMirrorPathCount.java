package BiweeklyContest_164;

import java.util.*;

public class C_twistedMirrorPathCount {

	int mod = (int) 1e9 + 7;

    public int solve(int row, int col, int dir, int[][] grid, int[][][] dp, int m, int n) {
        
        if (row < 0 || col < 0 || row >= m || col >= n) return 0;
        
        if (row == m - 1 && col == n - 1) {
            return 1;
        }

        if (dp[row][col][dir] != -1) return dp[row][col][dir];

        int ans = 0;

        if(grid[row][col] == 1){

            if(dir == 1){   // right -> down (mirror)

                ans = solve(row + 1, col, 0, grid, dp, m, n);
            }

            else{           // down -> right (mirror)

                ans = solve(row, col + 1, 1, grid, dp, m, n);
            }
        }

        else{

            ans = solve(row, col + 1, 1, grid, dp, m, n);
            ans += solve(row + 1, col, 0, grid, dp, m, n);
        }

        return dp[row][col][dir] = (ans % mod);
    }
    
    public int uniquePaths(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][][] dp = new int[m][n][2]; 
        
        for (int[][] row1 : dp) {
            
            for(int[] row: row1) Arrays.fill(row, -1);
        }

        int ans = solve(0, 0, 0, grid, dp, m, n);

        return ans;
    }
}
