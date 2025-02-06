class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int n=nums[i]*nums[j];
                if(map.containsKey(n)){
                    map.put(n,map.get(n)+1);
                }else{
                    map.put(n,1);
                }
            }
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            sum+=(((i.getValue()-1)*i.getValue())/2)*8;
        }
        return sum;
    }
}
