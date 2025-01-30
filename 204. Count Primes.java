class Solution {
    public int countPrimes(int n) {
        if(n<3){
            return 0;
        }
        else{
            int count=1;
            for(int i=3;i<n;i+=2)
            {
                boolean c=true;
                for(int j=2;j<=i/3;j++)
                {
                    if(i%j==0){
                        c=false;
                        break;
                    }
                }
                if(c){
                    count++;
                }
            }
            return count;
        }

    }
}
