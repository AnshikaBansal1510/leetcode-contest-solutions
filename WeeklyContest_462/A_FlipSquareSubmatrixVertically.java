/*
 *    T.C. - O(k^2)
 */

public class A_FlipSquareSubmatrixVertically{

	public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        int top = x;
        int bottom = top + k - 1;

        while(top < bottom){

            for(int idx = y ; idx < y + k ; idx++){

                int temp = grid[top][idx];
                grid[top][idx] = grid[bottom][idx];
                grid[bottom][idx] = temp;
            }

            top++;
            bottom--;
        }

        return grid;
    }
}