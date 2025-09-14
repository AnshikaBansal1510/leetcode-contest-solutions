package WeeklyContest_466;

import java.util.*;

public class A_minOpToEqualizeArray {

	public int minOperations(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){

            set.add(num);
        }

        if(set.size() == 1){

            return 0;
        }

        return 1;
    }
}
