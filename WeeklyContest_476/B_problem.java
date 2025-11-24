package WeeklyContest_476;

public class B_problem {
	
	public int minLengthAfterRemovals(String s) {

        int res = 0;
        int n = s.length();
        int cnt_a = 0, cnt_b = 0;

        for(int idx = 0 ; idx < n ; idx++){

            if(s.charAt(idx) == 'a'){

                cnt_a++;
            }

            else{

                cnt_b++;
            }
        }

        res = Math.abs(cnt_a - cnt_b);
        return res;
    }
}
