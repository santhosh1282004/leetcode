class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int f;
        while(n>0){
            f=n%10;
            sum+=f;
            product*=f;
            n/=10;
        }
        int ret=product-sum;
        return ret;
        
    }
}
