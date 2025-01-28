class Solution {
    public String toLowerCase(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>64 && c<91){
                str+=(char)(s.charAt(i)+32);
            }else{
                str+=c;
            }
            
        }
        return str;
    }
}
