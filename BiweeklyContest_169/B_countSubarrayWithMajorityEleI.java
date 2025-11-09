package BiweeklyContest_169;

public class B_countSubarrayWithMajorityEleI {
	
	public int countMajoritySubarrays(int[] nums, int target) {

        int n = nums.length;
        int cnt = 0;

        for(int idx = 0 ; idx < n ; idx++){

            int count = 0;

            for(int jdx = idx ; jdx < n ; jdx++){

                if(nums[jdx] == target){

                    count++;
                }

                int len = jdx - idx + 1;

                if(count > len / 2){

                    cnt++;
                }
            }
        }

        return cnt;
    }
}
