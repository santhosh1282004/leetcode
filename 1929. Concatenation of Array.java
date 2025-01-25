class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int l=len*2;
        int [] arr=new int[l];
        for(int i=0;i<len;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<len;i++){
            arr[len+i]=nums[i];
        }
        return arr;
    }
}
