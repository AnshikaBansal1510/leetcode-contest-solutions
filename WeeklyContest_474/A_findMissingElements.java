package WeeklyContest_474;

import java.util.*;

public class A_findMissingElements {
	
	public List<Integer> findMissingElements(int[] nums) {
        
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        Arrays.sort(nums);

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)     set.add(num);

        List<Integer> ans = new ArrayList<>();

        int ele = min;

        while(ele <= max){

            if(!set.contains(ele)){

                ans.add(ele);
            }

            ele++;
        }

        return ans;
    }
}
