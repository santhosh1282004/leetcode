class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length && arr[i]<=k;i++){
            k++;
        }
        return k;
    }
}
