class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int rem= (len*(len+1))/2;
        for(int i:nums){
            rem-=i;
        }
        return rem;
    }
}
