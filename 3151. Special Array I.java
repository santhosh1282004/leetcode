class Solution {
    public boolean isArraySpecial(int[] nums) {
        int count=0;
        int len=nums.length;
        if(len<2){
            return true;
        }
        for(int i=0;i<len-1;i++){
            if(((nums[i]+nums[i+1])&1)==0){
                return false;
            }
        }
        return true;
    }
}
