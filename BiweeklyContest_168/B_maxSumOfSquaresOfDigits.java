package BiweeklyContest_168;

public class B_maxSumOfSquaresOfDigits {

	public String maxSumOfSquares(int num, int sum){
	
		if(sum > (num * 9)){

			return "";
		}

		StringBuilder res = new StringBuilder();

		for(int idx = 0 ; idx < num ; idx++){

			if(sum >= 9){

				sum -= 9;
				res.append('9');
			}

			else{

				char rem = (char) (sum + '0');
				res.append(rem);
				sum = 0;
			}
		}

		if(sum != 0){

			return "";
		}

		return res.toString();
	}
}	
