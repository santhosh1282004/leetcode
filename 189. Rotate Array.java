class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        if(len<k){
            k=k%len;
        }
        int m=len-k;
        int [] arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=nums[i];
        }
        int index=0;
        for(int i=m;i<len;i++){
            nums[index]=nums[i];
            index++;
        }
        for(int i:arr){
            nums[index]=i;
            index++;
        }

    }
}
