class Solution {
    public String convert(String s, int numRows) {
        int len=s.length();
        if(numRows==1 || numRows >= len)return s;
        String str="";
        int x=(numRows-1)*2;
        for(int i=0;i<numRows;i++){
            for(int j=i;j<len;j+=x){
                str=str+s.charAt(j);
                int y=x+j-(i*2);
                if(i>0 && i<numRows-1 && y<len){
                    str=str+s.charAt(y);
                }
            }
        }
        return str;
    }
}
