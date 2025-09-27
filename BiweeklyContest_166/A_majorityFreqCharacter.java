package BiweeklyContest_166;

import java.util.*;

public class A_majorityFreqCharacter {

	public String majorityFrequencyGroup(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(int idx = 0 ; idx < s.length() ; idx++){

            map.put(s.charAt(idx), map.getOrDefault(s.charAt(idx), 0) + 1);
        }

        Map<Integer, List<Character>> grp = new HashMap<>();
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            
            int freq = entry.getValue();
            grp.putIfAbsent(freq, new ArrayList<>());
			
            char val = entry.getKey();
            grp.get(freq).add(val);
        }

        int max_size = -1;
        int max_freq = -1;

        for (Map.Entry<Integer, List<Character>> entry : grp.entrySet()){
            
            int freq = entry.getKey();
            int size = entry.getValue().size();

            if (size > max_size || (size == max_size && freq > max_freq)){
                
                max_size = size;
                max_freq = freq;
            }
        }

        StringBuilder res = new StringBuilder();
        
        for(char c : grp.get(max_freq)){
            
            res.append(c);
        }

        return res.toString();
    }
}
