class solution {
    public static void main(String[] args) {
        int[] arr={1,4,5,2,6,3};
        int[][] mat={{4,3,5},{1,2,6}};
        int arr_len=arr.length;
        int mat_collem_len=mat.length;
        int mat_row_len=mat[0].length;
        int [] collem= new int[mat_collem_len];
        int [] row= new int[mat_row_len];
        int r=0;
        for(int i=0;i<arr_len;i++){
            for(int j=0;j<mat_collem_len;j++){
                for(int k=0;k<mat_row_len;k++){
                    if(arr[i]==mat[j][k]){
                        collem[j]++;
                        row[k]++;
                        if(collem[j]==mat_row_len || row[k]== mat_collem_len){
                            r=i;
                            break;
                        }
                    }
                }
            }
        }return r;
    }
} 
