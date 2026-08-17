package Backtracking;

public class Maze {

    public static int solveMaze(int col, int row){


        if(row == 1 || col == 1){
            return 1 ;
        }
        int count = 0 ;

        int down = solveMaze( col - 1, row);
        int right = solveMaze(col, row - 1);

        count = down + right ;

        return count ;
    }


    public static void solveMazeProcess(String process, int row, int col){

        if(row == 1 && col == 1){
            System.out.println(process);
            return ;
        }

        if(row > 1) {
            solveMazeProcess(process + 'D', row - 1 , col);
        }

        if(col > 1){
            solveMazeProcess(process + 'R', row, col - 1);
        }
    }

    public static void solveMazeDiag(String process, int row, int col){

        if(row == 1 && col == 1){
            System.out.println(process);
            return ;
        }

        if(row > 1) {
            solveMazeDiag(process + 'D', row - 1 , col);
        }

        if(col > 1){
            solveMazeDiag(process + 'R', row, col - 1);
        }

        if(col > 1 && row > 1){
            solveMazeDiag(process + 'd', row - 1, col - 1);
        }
    }

    public static void solveMazeObstacle(String p, boolean [][] maze , int row, int col){

        if(row == maze.length -1  && col == maze[0].length -1 ){
            System.out.println(p);
            return ;
        }

        if( maze[row][col] == false){
            return;
        }

        if(row < maze.length - 1  ) {
            solveMazeObstacle(p + 'D', maze,  row + 1 , col);
        }

        if(col < maze[0].length - 1){
            solveMazeObstacle(p + 'R', maze,  row, col  + 1);
        }
         
    }

    public static void main(String[] args) {

        // System.out.println(solveMaze(3, 3));
        // solveMazeProcess("", 3, 3);
        // solveMazeDiag("", 3, 3);

        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true},  
        };

        solveMazeObstacle("", board, 0, 0);
        
    }
    
}
