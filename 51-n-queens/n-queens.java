public class Solution {
    private List<List<String>> solutions = new ArrayList<>();
    private Set<Integer> cols = new HashSet<>();
    private Set<Integer> leftDiags = new HashSet<>();
    private Set<Integer> rightDiags = new HashSet<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        
        // Fill the board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(board, 0, n);
        return solutions;
    }

    private void backtrack(char[][] board, int row, int n) {
        if (row == n) {
            solutions.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col)) {
                placeQueen(board, row, col);
                backtrack(board, row + 1, n);
                removeQueen(board, row, col);
            }
        }
    }

    private boolean isSafe(int row, int col) {
        return !cols.contains(col) &&
               !leftDiags.contains(row + col) &&
               !rightDiags.contains(row - col);
    }

    private void placeQueen(char[][] board, int row, int col) {
        board[row][col] = 'Q';
        cols.add(col);
        leftDiags.add(row + col);
        rightDiags.add(row - col);
    }

    private void removeQueen(char[][] board, int row, int col) {
        board[row][col] = '.';
        cols.remove(col);
        leftDiags.remove(row + col);
        rightDiags.remove(row - col);
    }

    private List<String> construct(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }
}
