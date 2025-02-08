class Solution {
    static int palindrome(String s){
        int i=0;
        int len=s.length();
        int j=len-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return 0;
            }
            i++;
            j--;
        }
        return len;
    }
    public String longestPalindrome(String s) {
        int len=s.length();
        int [] l=new int[2];
        int max=l[1]-l[0];
        for(int i=0;i<len;i++){
            for(int j=len-1;j>=i;j--){
                if(s.charAt(i)==s.charAt(j)){
                    if(max<palindrome(s.substring(i,j+1))){
                        max=j-i;
                        l[0]=i;
                        l[1]=j;
                    }
                }
            }
        }
        return s.substring(l[0],l[1]+1);
    }
}
