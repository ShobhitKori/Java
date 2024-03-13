import java.util.ArrayList;
import java.util.List;

public class nQueens {
    public static boolean isSafe(int row, int col, char[][] board) {
        for(int j=0; j<board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; r--, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        //upper right
        r = row;
        for(int c=col; c<board.length && r>=0; r--, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        //lower left
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        //lower right
        r = row;
        for(int c=col; c<board.length && r<board.length; r++, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        ArrayList<String> newBoard = new ArrayList<String>();

        for(int i=0; i<board.length; i++) {
            row = "";
            for (int j=0; j <board[i].length; j++) {
                if(board[i][j] == 'Q')
                    row += 'Q';
                else 
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public static void helper(char[][] board, List<List<String>> allBoards, int col) {
        if(col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for(int row=0; row < board.length; row++) {
            if(isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n]; 
        helper(board, allBoards, 0);
        return allBoards;
    }
    public static void main(String[] args) {
        List<List<String>> allBoards = solveNQueens(4);
        for(List<String> innerlist : allBoards) {
            for(String val : innerlist) {
                System.out.println(val);
            }
            System.out.println();
        }
    }
}
