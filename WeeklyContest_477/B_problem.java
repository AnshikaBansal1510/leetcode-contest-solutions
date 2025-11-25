package WeeklyContest_477;

import java.util.*;

public class B_problem {

	public int maxBalancedSubarray(int[] nums) {

        int n = nums.length;
        int preXor = 0;
        int parDiff = 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("0%0", -1);

        int res = 0;

        for(int idx = 0 ; idx < n ; idx++){
            
            preXor ^= nums[idx];

            if(nums[idx] % 2 == 0){
                
                parDiff += 1;
                
            } else {
                
                parDiff -= 1;
            }

            String k = preXor + "%" + parDiff;

            if(map.containsKey(k)){
                
                int l = idx - map.get(k);
                res = Math.max(res, l);
                
            } else {
                
                map.put(k, idx);
            }
        }

        return res;
    }
}
