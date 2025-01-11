class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList <Integer> arr= new ArrayList<>();
        for(int i=left;i<=right;i++){
            int copy=i;
            boolean condesion = true;
            while(copy>0){
                int first=copy%10;
                if(first == 0 || i%first!=0){
                    condesion=false;
                    break;
                }
                copy/=10;
            }
            if(condesion){
                arr.add(i);
            }

        }
        return arr;
    }
}
