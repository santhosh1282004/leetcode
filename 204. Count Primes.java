import java.util.*;
public class Solution{
    public int countPrimes(int n) {
        ArrayList <Integer> list=new ArrayList<>();
        if(n<3){
            return 0;
        }
        else{
            boolean c;
            int count=1;
            for(int i=3;i<n;i+=2){
                c=true;
                for(int j:list){
                    if(i%j==0){
                        c=false;
                        break;
                    }
                }
                if(c){
                    count++;
                    list.add(i);
                }
            }
            return count;
        }
    }
}
