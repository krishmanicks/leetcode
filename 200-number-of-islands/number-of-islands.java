class Solution {
    public int numIslands(char[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int total = 0;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if (grid[i][j] == '1') {
                    solve(i, j, rows, cols, grid);
                    total++;
                }
            }
        }

        return total;
        
    }

    private void solve(int i, int j, int rows, int cols, char[][] grid) {
        if(i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != '1') {
            return;
        }

        grid[i][j] = '2';

        solve(i+1, j, rows, cols, grid);
        solve(i, j+1, rows, cols, grid);
        solve(i-1, j, rows, cols, grid);
        solve(i, j-1, rows, cols, grid);
    }
}