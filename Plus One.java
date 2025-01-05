class Solution {
    public int[] plusOne(int[] digits) {
        int len =digits.length;
        for (int i=len-1;i>=0;i--) {
            if(digits[i]<9) {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        if(digits[0]==0){
            int[] array= new int[len+1];
            array[0]= 1;
            return array;
        }
        return digits;
    }
}
