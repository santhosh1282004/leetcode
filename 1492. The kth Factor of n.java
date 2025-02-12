class Solution {
    public int kthFactor(int n, int k) {
        int m=-1;
        int count=0;
        int len =n/2;
        for(int i=1;i<=len;i++){
            if(n%i==0){
                count++;
            }
            if(count==k){
                return i;
            }
        }
        int r=(count+1==k)? n:-1;
        return r;
        
    }
}
