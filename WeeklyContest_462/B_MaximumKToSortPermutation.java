/*
 *  Properties of bitwise AND : 
 * 	If x = a & b then all the bits in 'a' which were on, may or may not be ON in 'x', but for sure which were OFF will also be OFF in 'x'.
 * 	So, basically we can loose some bits, but not gain the bits. ( x <= a , x <= b )
 *  Even if a & b != k, we can swap them taking k as an intermediate element using 3 swaps.
 *  => a & k == k
 *  => b & k == k
 * 
 * 	INTUITION : Let optimal answer be k. Then k must be element of the permutation and we can use it as an intermediate element to swap the other elements however we want.
 *  given that => swap[x, y] : x & k == k and y & k == k
 *  Only the elements which are not in their correct place need to be swapped.
 * 
 *  T.C. - O(n)
 */

public class B_MaximumKToSortPermutation{

	public int sortPermutation(int[] nums) {
			
		int ans = Integer.MAX_VALUE;

		for(int idx = 0 ; idx < nums.length ; idx++){

			if(nums[idx] != idx){

				ans = ans & nums[idx];
			}
		}

		if(ans == Integer.MAX_VALUE)        return 0;
		return ans;
	}
}