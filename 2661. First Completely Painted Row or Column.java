class solution {
    public static void main(String[] args) {
        int[] arr={1,4,5,2,6,3};
        int[][] mat={{4,3,5},{1,2,6}};
        int[] map = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            map[arr[i]] = i;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < mat.length; i++) {
            int max = 0;
            for (int j = 0; j < mat[i].length; j++) {
                max = Math.max(max, map[mat[i][j]]);
            }
            ans = Math.min(ans, max);
        }
        for (int i = 0; i < mat[0].length; i++) {
            int max = 0;
            for (int j = 0; j < mat.length; j++) {
                max = Math.max(max, map[mat[j][i]]);
            }
            ans = Math.min(ans, max);
        }
        System.out.println(ans);
    }
} 
