package WeeklyContest_468;

import java.util.Arrays;

public class B_maximumTotalSubarrayValue {
	
	public long maxTotalValue(int[] nums, int k) {

        long res = 0;

        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        res = (k * ((long) max - (long) min));

        return res;
    }
}
