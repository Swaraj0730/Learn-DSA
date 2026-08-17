package Backtracking;

public class SodokuSolver {

    public static boolean solver(int[][] board){
        
        int n = board.length ;
        int row = -1 ;
        int col = -1 ;

        boolean emptyLeft = true ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(board[i][j] == 0 ){
                    row = i ;
                    col = j ;
                    emptyLeft = false;
                    break ;
                }
            }

            // if found in empty in row
            if(emptyLeft == false){
                break ;
            }
        }
        if(emptyLeft == true){
            return true ;
        }

        //backtrack

        for(int num = 1 ; num <= 9; num++){
            if(isSafe(board, row, col, num)){
                board[row][col] = num ;
                if(solver(board)){
                    return true;
                }
                else{
                    // backtrack
                    board[row][col] = 0 ;
                }
            }
        }
        return false;

    }
    
    private static void display(int[][] board) {
       
        for(int[] row : board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col , int num){

        // check the row
        for(int i = 0 ; i < board.length ; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        // check the col
        for(int[] nums : board){
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowstart = row - row % sqrt ;
        int colstart = col - col % sqrt ;

        for(int r = rowstart ; r < rowstart + sqrt ; r++ ){ // rowstart + sqrt = complete length of the square
            for(int c = colstart ; c < colstart + sqrt ; c++ ){
                if(board[r][c] == num){
                    return false ;
                }
            }
        }    
        return true ;
    }

    public static void main(String[] args) {

        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(solver(board)){
            display(board);
        }
    }
    
}
