class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int n=0;n<nums.length;n++){
            for(int a=n+1;a<nums.length;a++){
                if(nums[a]+nums[n] == target){
                   return new int[]{a,n};
               }
            }
        }
        return new int[]{-1,-1};
    }
}
