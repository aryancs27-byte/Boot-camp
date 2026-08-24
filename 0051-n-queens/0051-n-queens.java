import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i = 0; i<n; i++){
            Arrays.fill(board[i], '.');
        }

        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];

        backtrack(0, n, board, cols, diag1, diag2, result);
        return result;
    }
    private void backtrack(int r, int n, char[][] board, boolean[] cols,boolean[] diag1, boolean[] diag2, List<List<String>> result){
        if(r == n){
            result.add(constructBoard(board));
            return;
        }
        for(int c = 0; c < n; c++){
            int d1 = r+c;
            int d2 = r-c+n-1;

            if (cols[c] || diag1[d1] || diag2[d2]) {
                continue;
            }

            board[r][c] = 'Q';
            cols[c] = diag1[d1] = diag2[d2] = true;

            backtrack(r + 1, n, board, cols, diag1, diag2, result);

            board[r][c] = '.';
            cols[c] = diag1[d1] = diag2[d2] = false;
        }
    }
    private List<String> constructBoard(char[][] board) {
        List<String> current = new ArrayList<>();
        for (char[] row : board) {
            current.add(new String(row));
        }
        return current;
    }

}