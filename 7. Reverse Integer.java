class Solution {
    public int reverse(int x) {
        int r=(x<0)? (-1):(1);
        x*=r;
        int rev=0;
        while(x>0){
            int deg=x%10;
            if(rev<=(Integer.MAX_VALUE-deg)/10){
                rev=rev*10+deg;
            }
            else{
                return 0;
            }
            x/=10;
        }
        rev*=r;
        return rev;
        
    }
}
