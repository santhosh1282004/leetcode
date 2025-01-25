class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] arr = new int[len*2];
        System.arraycopy(nums,0,arr,0,len);
        System.arraycopy(nums,0,arr,len,len);
        return arr;

    }
}
