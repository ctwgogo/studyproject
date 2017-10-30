class Solution
{
	public int removeElement(int[] nums , int val )
	{
		int n = nums.length;
		int i = 0;
		while(i < n ){
			if( val == nums[i] )
			{
				nums[i] = nums[n-i];
				n--;
			}else{
				i++;
		}
		return n;
	}
}
