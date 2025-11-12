package WeeklyContest_475;

import java.util.*;

public class B_problem {

	public int minimumDistance(int[] nums) {

        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int idx = 1 ; idx <= nums.length ; idx++){

            map.put(idx, new ArrayList<>());
        }

        for(int idx = 0 ; idx < nums.length ; idx++){

            map.get(nums[idx]).add(idx);
        }

        int minDist = Integer.MAX_VALUE;

        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){

            List<Integer> sub = entry.getValue();
            Collections.sort(sub);

            for(int idx = 0 ; idx + 2 < sub.size() ; idx++){
                
                int x = sub.get(idx);
                int y = sub.get(idx + 1);
                int z = sub.get(idx + 2);

                int dist = Math.abs(x - y) + Math.abs(y - z) + Math.abs(z - x);
                minDist = Math.min(minDist, dist);
            }
        }

        if(minDist == Integer.MAX_VALUE){

            return -1;
        }

        return minDist;
    }
}
