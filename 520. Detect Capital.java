class Solution {
    public boolean detectCapitalUse(String word) {
        int count=1;
        int i=0;
        int len=word.length();
        if(len==1)return true;
        boolean b= word.charAt(i)<'Z' || (word.charAt(i)>'Z' &&  word.charAt(i+1)>'Z');
        i++;
        while(b && i<len){
            if(word.charAt(i)>'Z'){
                count++;
                i++;
            }
            else{
                i++;
            }
        }
        return b &&(count==len || count==1);
    }
}
