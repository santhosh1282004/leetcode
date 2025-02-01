class Solution {
    public boolean isArraySpecial(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len-1;i++){
            if(((nums[i]+nums[i+1])&1)==0){
                return false;
            }
        }
        return true;
    }
}
