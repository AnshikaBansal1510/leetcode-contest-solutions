package WeeklyContest_465;

import java.util.*;

public class A_restoreFinishingOrder {
	
	public int[] recoverOrder(int[] order, int[] friends) {

        int[] res = new int[friends.length];

        HashSet<Integer> set = new HashSet<>();

        for(int friend : friends){

            set.add(friend);
        }

        int index = 0;

        for(int o : order){

            if(set.contains(o)){

                res[index] = o;
                index++;
            }
        }

        return res;
    }
}
