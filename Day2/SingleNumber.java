class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length; 
        int val=0;
        for(int ctr=0;ctr<len;ctr++){
            val ^= nums[ctr];
        }
        return val;
    }
}
