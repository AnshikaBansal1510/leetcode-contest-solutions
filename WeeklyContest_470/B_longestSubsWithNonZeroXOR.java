package WeeklyContest_470;

public class B_longestSubsWithNonZeroXOR {
	
	public int longestSubsequence(int[] nums) {
        
        int xor = 0;
        int n = nums.length;

        boolean allZero = true;

        for(int num : nums){

            if(num != 0){

                allZero = false;
                break;
            }
        }

        for(int num : nums){

            xor = xor ^ num;
        }

        if(allZero == true)     return 0;

        if(xor == 0)    return (n - 1);

        return n;
    }
}
