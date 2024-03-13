import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class demo {

    public static boolean isSafe(int row, int col, char[][] board) {
        // Horizontal
        for (int j = 0; j < board.length; j++)
            if (board[row][j] == 'Q')
                return false;

        // Vertical
        for (int i = 0; i < board.length; i++)
            if (board[i][col] == 'Q')
                return false;

        // Upper left
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        // Upper right
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        // Lower left
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--)
            if (board[i][j] == 'Q')
                return false;

        // Lower right
        for (int i = row, j = col; i < board.length && j < board.length; i++, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoard) {
        List<String> newBoard = new ArrayList<>();

        for (char[] chars : board) {
            newBoard.add(new String(chars));
        }
        allBoard.add(newBoard);
    }

    public static void helper(List<List<String>> allBoards, char[][] board, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(allBoards, board, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] chars : board) {
            Arrays.fill(chars, '.');
        }
        helper(allBoards, board, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        List<List<String>> allBoards = solveNQueens(4);
        for (List<String> innerList : allBoards) {
            // Iterate through the inner list
            for (String value : innerList) {
                System.out.println(value);
            }
            // Move to the next line after printing the inner list
            System.out.println();
        }
    }
}

