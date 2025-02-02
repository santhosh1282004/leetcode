class Solution {
    public boolean check(int[] nums) {
    int len=nums.length-1;
     byte count=0;
     for(int i=0;i<len;i++){
        if(nums[i]>nums[i+1]){
            count++;
        }
     }
     return((count==1 && nums[0]>=nums[len]) || count==0);    
    }
}
