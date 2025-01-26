class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        int start=0,end=len-1;
        while(start<(len/2)){
            for(int j=start;j<end;j++){
                int I=len-start-1;
                int J=len-j-1;
                int temp=matrix[start][j];
                matrix[start][j]=matrix[J][start];
                matrix[J][start]=matrix[I][J];
                matrix[I][J]=matrix[j][I];
                matrix[j][I]=temp;
            }
            start++;
            end--;
        }
    }
}
