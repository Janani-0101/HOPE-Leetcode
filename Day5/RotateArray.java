class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        reverse(0,n-1,arr);
        reverse(0,k-1,arr);
        reverse(k,n-1,arr);
    }
    private void reverse(int l,int r,int[] arr){
        while(l<r){
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
