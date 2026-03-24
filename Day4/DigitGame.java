class Solution {
    public boolean canAliceWin(int[] nums) {
       int s=0,d=0;
       for(int n:nums){
        if(n<10)
         s+=n;
        else
         d+=n;
       }  
       return s!=d;
    }
}
