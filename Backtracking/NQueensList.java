package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueensList {

    public static List<List<String>> helper(boolean[][] board , int n){

        if( n == board.length){ 
            return display(board);      
        }
        List<List<String>> ans = new ArrayList<>();

        for(int col = 0 ; col < board.length ; col++){
            if(isSafe(board, n, col)){
                board[n][col] = true ;
                ans.addAll(helper(board, n+1));
                board[n][col] = false ;
            }
        }
        return ans;
    }

    private static boolean isSafe(boolean[][] board, int n, int col) {

        // vertical row
        for(int i = 0 ; i <= n ; i++){
            if(board[i][col]){
                return false;
            }
        }

        // diagonal left 
        int maxLeft = Math.min(n, col);
        for(int i = 0 ; i <= maxLeft ; i++){
            if(board[n-i][col-i]){
                return false;
            }
        }

        // diagonal rigth
        int maxRight = Math.min(n, board.length - col - 1);
        for(int i = 0 ; i <= maxRight ; i++){
            if(board[n-i][col+i]){
                return false;
            }
        }
        return true ;
    }

    private static List<List<String>> display(boolean[][] board) {

        List<List<String>> list = new ArrayList<>();
        List<String> sol = new ArrayList<>();

        for(int row = 0 ; row < board.length ; row++){
            StringBuilder sb = new StringBuilder();
            for(int col = 0 ; col < board.length ; col++){
                sb.append(board[col][row] ? "Q" : ".");
            }
            sol.add(sb.toString());
        }
        list.add(sol);
        return list;
    }

    public static List<List<String>> solveQueens(int n){

        boolean[][] board = new boolean[n][n];
        return helper(board, 0);

    }

    public static void main(String[] args) {
        List<List<String>> result = solveQueens(4);
        for (List<String> sol : result) {
            for (String row : sol)System.out.println(row);
            System.out.println();
        }
        
    }
}
    

