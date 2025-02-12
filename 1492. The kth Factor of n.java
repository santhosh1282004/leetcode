lass Solution {
    public int kthFactor(int n, int k) {
        int m=-1;
        int count=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
            if(count==k){
                return i;
            }
        }
        return (count+1==k)? n:-1;
        
    }
}
