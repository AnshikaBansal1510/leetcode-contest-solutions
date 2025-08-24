package WeeklyContest_464;

public class A_gcdOddEvenSums {

	public int gcd(int a, int b) {
     
        if (a == 0) 	return b;
        if (b == 0)		return a;
        if (a == b)		return a;
        if (a > b)		return gcd(a - b, b);
        
        return gcd(a, b - a);
    }
    
    public int gcdOfOddEvenSums(int n) {

        int oddSum = 0, evenSum = 0;

        for(int idx = 1 ; idx <= (1 + (n - 1) * 2) ; idx += 2){

            oddSum += idx;
        }

        for(int idx = 2 ; idx <= (2 + (n - 1) * 2) ; idx += 2){

            evenSum += idx;
        }

        return gcd(evenSum, oddSum);
    }
}
