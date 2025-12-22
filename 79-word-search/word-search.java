class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[rows][col];

        for (int i=0;i<rows;i++) {
            for (int j=0;j<col;j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(check(rows, col, i, j, board, word, visited, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean check(int row, int col, int i, int j, char[][] board, String word, boolean[][] visited, int index) {
        if (index == word.length()) {
            return true;
        }
        if(i < 0 || i >= row || j < 0 || j >= col || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        visited[i][j] = true;

        boolean found =  check(row, col, i+1, j, board, word, visited, index + 1) ||
        check(row, col, i-1, j, board, word, visited, index + 1) ||
        check(row, col, i, j+1, board, word, visited, index + 1) ||
        check(row, col, i, j-1, board, word, visited, index + 1);

        visited[i][j] = false;

        return found;
    }
}