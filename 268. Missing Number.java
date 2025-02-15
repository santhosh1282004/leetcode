class Solution {
    public int missingNumber(int[] nums) {
        int rem= (nums.length*(nums.length+1))/2;
        for(int i:nums){
            rem-=i;
        }
        return rem;
    }
}
