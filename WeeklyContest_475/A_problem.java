package WeeklyContest_475;

public class A_problem {
	
	public int minimumDistance(int[] nums) {

        int n = nums.length;
        int minDist = Integer.MAX_VALUE;

        for(int idx = 0 ; idx < n ; idx++){

            for(int jdx = idx + 1 ; jdx < n ; jdx++){

                for(int kdx = jdx + 1 ; kdx < n ; kdx++){

                    if(nums[idx] == nums[jdx] && nums[jdx] == nums[kdx] && nums[kdx] == nums[idx]){

                        int dist = Math.abs(idx - jdx) + Math.abs(jdx - kdx) + Math.abs(kdx - idx);
                        minDist = Math.min(minDist, dist);
                    }
                }
            }
        }

        if(minDist == Integer.MAX_VALUE){

            return -1;
        }

        return minDist;
    }
}
