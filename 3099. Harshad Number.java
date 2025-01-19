class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int copy=x,sum=0;
        while(copy>0){
            sum+=copy%10;
            copy/=10;
        }
        int ret=(x%sum==0)? sum:-1;
        return ret;
    }
}
