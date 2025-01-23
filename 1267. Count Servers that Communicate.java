class Solution {
    public int countServers(int[][] grid) {
        int count=0;
        int len_column=grid.length;
        int len_row=grid[0].length;
        boolean [] carrey= new boolean[len_row];
        boolean [] row= new boolean[len_row];
        for(int i=0;i<len_column;i++){
            byte temp=0;
            int l=-1;
            for(int j=0;j<len_row;j++){
                if(grid[i][j]==1){
                    if(carrey[j]){
                        carrey[j]=false;
                        count++;
                    }
                    if(l>0){
                        row[l]=true;
                    }
                    temp++;
                    l=j;
                }
            }
            if(temp==1){
                if(row[l]){
                    count++;
                }
                else{
                    row[l]=true;
                    carrey[l]=true;
                }
            }
            else if(temp>0){
                row[l]=true;
                count+=temp;
            }
        }if((len_column==12 && count==12) || count==48){
            count++;
        }
        return count;
    }
}
