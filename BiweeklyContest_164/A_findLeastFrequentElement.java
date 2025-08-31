package BiweeklyContest_164;

import java.util.*;

public class A_findLeastFrequentElement {

	public int getLeastFrequentDigit(int n) {

        String num = String.valueOf(n);

        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : num.toCharArray()) {
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int minFreq = Integer.MAX_VALUE;
        int ans = 9;
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            
            int digit = entry.getKey() - '0';
            int cnt = entry.getValue();
            
            if (cnt < minFreq || (cnt == minFreq && digit < ans)) {
				
                minFreq = cnt;
                ans = digit;
            }
        }
        
        return ans;
    }
}
