package WeeklyContest_468;

public class A_bitwiseOrOfEven {
	
	public int evenNumberBitwiseORs(int[] nums) {

        int res = 0;

        for(int num : nums){

            if(num % 2 == 0){

                res = res | num;
            }
        }

        return res;
    }
}
