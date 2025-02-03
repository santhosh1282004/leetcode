class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int do_c=1;
        int up_c=1;
        int max_u=1;
        int max_d=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                if(do_c>1){
                    do_c=1;
                }
                up_c++;
                if(up_c>max_u){
                    max_u=up_c;
                }
            }
            else if(nums[i]>nums[i+1]){
                if(up_c>1){
                    up_c=1;
                }
                do_c++;
                if(do_c>max_d){
                    max_d=do_c;
                }
            }else if(nums[i]==nums[i+1]){
                up_c=1;
                do_c=1;
            }

        }
        if(max_u>max_d){
            return max_u;
        }
        else{
            return max_d;
        }
    }
}
