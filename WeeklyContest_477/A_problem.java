package WeeklyContest_477;

public class A_problem {
	
	public long sumAndMultiply(int n) {

        StringBuilder sb = new StringBuilder();

        int num = n;

        while(num > 0){

            int ld = num % 10;
            if(ld != 0)    sb.append((char) (ld + '0'));
            num /= 10;
        }

        String rev = sb.reverse().toString();

        long sum = 0;

        for(int idx = 0 ; idx < rev.length() ; idx++){

            sum += (int) (rev.charAt(idx) - '0');
        }

        if(rev == ""){

            return 0;
        }

        long x = Long.parseLong(rev);

        return (x * sum);
    }
}
