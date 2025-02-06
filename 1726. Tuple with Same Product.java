class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int n=nums[i]*nums[j];
                map.merge(n, 1, Integer::sum);
            }
        }
        int sum=0;
        for(int i:map.values()){
            sum+=(((i-1)*i)/2)<<3;
        }
        return sum;
    }
}
