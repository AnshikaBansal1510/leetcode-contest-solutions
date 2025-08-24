package WeeklyContest_464;

import java.util.*;

public class B_partitionArrayIntoKGroups {

	public boolean partitionArray(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = nums.length;

        if (n % k != 0) 		return false;

        int grps = n / k;

        for (int cnt : map.values()) {

            if (cnt > grps) 	return false;
        }

        return true;
    }
}
