class Solution {
    public int fib(int n) {
        int f1=0;
        int f2=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=f1+f2;
            f1=f2;
            f2=sum;
        }
        return f1;
        
    }
}
