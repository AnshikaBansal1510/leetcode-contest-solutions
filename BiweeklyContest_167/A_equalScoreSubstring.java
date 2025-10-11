package BiweeklyContest_167;

public class A_equalScoreSubstring {

	public boolean scoreBalance(String s) {

        long total = 0;

        for(int idx = 0 ; idx < s.length() ; idx++){

            total += (s.charAt(idx) - 'a' + 1);
        }

        long sum = 0;

        for(int idx = 0 ; idx < s.length() ; idx++){

            sum += (s.charAt(idx) - 'a' + 1);

            if(sum == (total - sum)){

                return true;
            }
        }

        return false;
    }
}
