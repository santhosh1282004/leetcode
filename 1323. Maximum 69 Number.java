class Solution {
    public int maximum69Number (int num) {
        int copy=num;
        int max=num;
        int n=1;
        while(copy>0){
            if(copy%10==6){
                if(max<num+(3*n)){
                    max=num+(3*n);
                }
            }
            n*=10;
            copy/=10;
        }
        return max;
        
    }
}
