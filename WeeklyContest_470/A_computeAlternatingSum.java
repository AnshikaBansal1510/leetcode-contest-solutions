package WeeklyContest_470;

public class A_computeAlternatingSum {
	
	public int alternatingSum(int[] nums) {
        
        int oddSum = 0, evenSum = 0;

        for(int idx = 0 ; idx < nums.length ; idx++){

            if(idx % 2 == 0)    evenSum += nums[idx];
            else                oddSum += nums[idx];
        }

        return (evenSum - oddSum);
    }
}
