package WeeklyContest_469;

import java.util.*;

public class A_computeDecimalRep {

	public int[] decimalRepresentation(int n) {
        
        List<Integer> decimal = new ArrayList<>();
        int pow = 1;

        while(n != 0){

            int ld = n % 10;

            if(ld * pow != 0)   decimal.add(ld * pow);
			
            pow *= 10;
            n /= 10;
        }

        Collections.sort(decimal, Collections.reverseOrder());

        int[] res = new int[decimal.size()];
        int index = 0;

        for(int d : decimal){

            res[index++] = d; 
        }

        return res;
    }
}
