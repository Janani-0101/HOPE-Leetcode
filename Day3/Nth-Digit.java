class Solution {
    public int findNthDigit(int n) {
      long dig=1;
      long start=1;
      long count=9;
      while(n > dig*count){
        n -= (dig*count);
        dig++;
        count = count*10;
        start = start*10;
      }  
      long num = start+(n-1)/dig;
      String str = Long.toString(num);
      int ind = (n-1)%(int)dig;
      char ch = str.charAt(ind);
      return ch-'0';
    }
}
