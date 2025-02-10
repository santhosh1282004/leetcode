class Solution {
    public String clearDigits(String s) {
        int i=1;
        while(i<s.length()){
            if(s.charAt(i)>='0'+0 && s.charAt(i)<='9'){
                s=s.substring(0,i-1)+s.substring(i+1,s.length());
                i--;
            }
            else{
                i++;
            }

        }
        return s;
    }
}
