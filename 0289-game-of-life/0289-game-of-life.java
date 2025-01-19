class Solution {
    public void gameOfLife(int[][] board) {
       
        int rows = board.length;
        int cols = board[0].length;
        
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        
        int[][] newBoard = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int liveNeighbors = 0;
                
                for (int[] dir : directions) {
                    int newRow = i + dir[0];
                    int newCol = j + dir[1];
                    
                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && board[newRow][newCol] == 1) {
                        liveNeighbors++;
                    }
                }
                
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    newBoard[i][j] = 0;
                } else if (board[i][j] == 0 && liveNeighbors == 3) {
                    newBoard[i][j] = 1;
                } else {
                    newBoard[i][j] = board[i][j];
                }
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = newBoard[i][j];
            }
        }
    }
}
 