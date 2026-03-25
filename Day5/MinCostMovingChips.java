class Solution {
    public int minCostToMoveChips(int[] position) {
       int odd=0,even=0;
       for(int p=0;p<position.length;p++){
        if(position[p]%2==0)
          even++;
        else
         odd++;
       }       
       return Math.min(even,odd); 
    }
}
