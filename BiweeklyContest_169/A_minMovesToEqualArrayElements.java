package BiweeklyContest_169;

import java.util.Arrays;

public class A_minMovesToEqualArrayElements {
	
	public int minMoves(int[] nums) {

        int max = Arrays.stream(nums).max().getAsInt();

        int ans = 0;

        for(int num : nums){

            ans += (max - num);
        }

        return ans;
    }
}
