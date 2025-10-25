package BiweeklyContest_168;

public class A_lexicographicallySmallestStringAfterReverse {

	public String lexSmallest(String s){

        int n = s.length();
        String t = s;

        for(int k = 1 ; k <= n ; k++){

            StringBuilder sb = new StringBuilder(s.substring(0, k));
            String first = sb.reverse().toString() + s.substring(k);

            if(first.compareTo(t) < 0){

                t = first;
            }

            StringBuilder tb = new StringBuilder(s.substring(n - k));
            String second = s.substring(0, n - k) + tb.reverse().toString();

            if(second.compareTo(t) < 0){

                t = second;
            }
        }

        return t;
    }
}
