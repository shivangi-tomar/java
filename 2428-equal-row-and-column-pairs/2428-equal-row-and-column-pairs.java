class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int matrix[][]=new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[j][i] = grid[i][j];
            }
        }
        int pair=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(Arrays.equals(grid[i],matrix[j])){
                    pair++;
                }
            }
        }
        return pair;

        
    }
}