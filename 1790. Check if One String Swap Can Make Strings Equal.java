class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=-1;
        boolean b=false;
        boolean c=false;
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    if(c){
                        return false;
                    }
                    else if(count>-1 && s1.charAt(i)==s2.charAt(count) && s1.charAt(count)==s2.charAt(i)){

                        c=true;
                    }
                    else if(b){
                        return false;
                    }
                    else{
                        count=i;
                        b=true;
                    }
                }
            }
        }
        if((c & b) || ((!c) & (!b))){
                return true;
            }
        return false;
    }
}
