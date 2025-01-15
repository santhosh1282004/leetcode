class Solution {
    public int differenceOfSums(int n, int m) {
        int num=n/m;
        int div=2*(m*((num*(num+1))/2));
        int sum=(n*(n+1))/2;
        return sum-div; 
    }
}
