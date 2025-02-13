class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows >= s.length())return s;
        String str="";
        int x=(numRows-1)*2;
        int y=0;
        for(int i=0;i<numRows;i++){
            int j=i;
            boolean b=true;
            while(j<s.length()){
                str=str+s.charAt(j);
                if(y==0 || x==0){
                    j+=(numRows-1)*2;
                }
                else if(b){
                    j+=x;
                    b=false;
                }
                else{
                    j+=y;
                    b=true;
                }
            }
            x-=2;
            y+=2;
        }
        return str;
    }
}
