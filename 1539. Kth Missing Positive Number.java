class Solution {
    public int findKthPositive(int[] arr, int k) {
        int len=arr.length;
        if(k<arr[0]){
            return k;
        }
         for(int i=0;i<len;i++){
            if((arr[i]-(i+1))>=k){
                return arr[i-1]+k-(arr[i-1]-i);
            }
         }
         return (arr[len-1]+k-(arr[len-1]-len));
    }
}
