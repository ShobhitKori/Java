// import java.util.*;

// public class Backtracking {
//     public static boolean isSafe(int row, int col, char[][] board){
//         //horizontal
//         for(int j=0; j<board.length;j++)
//             if(board[row][j] == 'Q')
//                 return false;
        
//         //vertical
//         for(int i=0; i<board.length;i++)
//             if(board[i][col]=='Q')
//                 return false;
        
//         //upper left
//         int r = row;
//         fo r(int c=col; c>=0 && r>=0; c--, r--)
//             if(board[r][c]=='Q')
//                 return false;

//         //upper right
//         r = row;
//         for(int c=col; c<board.length && r>=0; c++,r--)
//             if(board[r][c]=='Q')
//                 return false;
        
//         //lower left
//         r = row;
//         for(int c=col; c>=0 && r<board.length; c--,r++)
//             if(board[r][c]=='Q')
//                 return false;
        
//         //lower right
//         r = row;
//         for(int c=col; c<board.length && r<board.length; c++,r++)
//             if(board[r][c]=='Q')
//                 return false;
        
//         return true;
//     }
//     public static void saveBoard(char[][] board, List<List<String>> allBoard){
//         String row = "";
//         ArrayList<String> newBoard = new ArrayList<>();

//         for(int i=0; i<board.length; i++){
//             row = "";
//             for(int j=0; j<board[0].length; j++)
//                 if(board[i][j]=='Q')
//                     row += 'Q';
//                 else
//                     row += '.';
//             newBoard.add(row);
//         }
//         allBoard.add(newBoard);
//     }
//     public static void helper(List<List<String>> allBoards, char[][] board, int col){
//         if(col==board.length){
//             saveBoard(board, allBoards);
//             return;
//         }
//         for(int row=0; row<board.length; row++){
//             if(isSafe(row, col, board)){
//                 board[row][col] = 'Q';
//                 helper(allBoards, board, col+1);
//                 board[row][col] = '.';
//             }
//         }
//     }
//     public static List<List<String>> solveNQueens(int n){
//         List<List<String>> allBoards = new ArrayList<>();
//         char[][] board = new char[n][n];
//         helper(allBoards, board, 0);
//         return allBoards;
//     }

//     public static void main(String[] args){
//         List<List<String>> allBoards = solveNQueens(4);
//         for (List<String> innerList : allBoards) {
//             // Iterate through the inner list
//             for (String value : innerList) {
//                 System.out.print(value + " ");
//             }
//             // Move to the next line after printing the inner list
//             System.out.println();
//         }
//     }
// }
