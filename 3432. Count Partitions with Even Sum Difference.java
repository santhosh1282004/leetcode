class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int s=0,leftsum =0,max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            sum=sum-nums[i];
            int v=leftsum-sum;
            if((v)%2==0 && max<v){
                max=v;
                s=i+1;
            }
        }
        return s;
    }
}
