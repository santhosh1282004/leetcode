class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length,sum=0;
        if(n==2){
            return nums;
        }
        for (int i:nums){
            sum^=i;
        }
        int c_bit=sum&-sum,b0=0,b1=0;
        for(int j:nums){
            if((j&c_bit)!=0){
                b0^=j;
            }
            else{
                b1^=j;
            }
        }
        int []arr= {b0,b1};
        System.gc();
        
        return arr; 
    }
  public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 2, 1, 3, 2, 5};
        int[] result1 = solution.singleNumber(nums1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");  
        
        int[] nums2 = {-1, 0};
        int[] result2 = solution.singleNumber(nums2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");  
        
        int[] nums3 = {0, 1};
        int[] result3 = solution.singleNumber(nums3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");  
    }
}
