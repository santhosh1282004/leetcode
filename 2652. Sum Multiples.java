class Solution {
    public int sumOfMultiples(int n) {
        int n3=n/3;
        int n5=n/5;
        int n7=n/7;
        int no5=n/15;
        int no71=n/21;
        int no72=n/35;
        int n357 = n / 105;
        int ret=(7*(n7*(n7+1))/2)+(5*(n5*(n5+1))/2)+(3*(n3*(n3+1))/2)-((35*(no72*(no72+1))/2)+(21*(no71*(no71+1))/2)+(15*(no5*(no5+1))/2)-(105*(n357*(n357+1))/2));
        return ret;
    }
}
