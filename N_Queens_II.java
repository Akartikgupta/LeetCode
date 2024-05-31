public class N_Queens_II {
    static boolean board[][];

    public static int totalNQueens(int n) {
        board = new boolean[n][n];
        return helper(0, n);
    }

    static boolean WillIPlace(int row, int col) {
        // case 1 above row
        for (int i = row; i >= 0; i--) {
            if (board[i][col]) {
                return false; // can't place
            }
        }
        // case 2 left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // case 3 right diagonal
        for (int i = row, j = col; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

    static int helper(int row, int n) {
        // base case
        if (row == n) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < n; col++) {
            if (WillIPlace(row, col)) {
                board[row][col] = true;
                count = count + helper(row + 1, n);
                board[row][col] = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }
}
