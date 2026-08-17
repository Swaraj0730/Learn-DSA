package Backtracking;

import java.util.Arrays;

public class AllPaths {

    public static void allPaths(String p , boolean[][] maze , int row, int col){

         if(row == maze.length -1  && col == maze[0].length -1 ){
            System.out.println(p);
            return ;
        }

        if( maze[row][col] == false){
            return;
        }
        
        // consider this block in my path
        maze[row][col] = false;

        // down
        if(row < maze.length - 1  ) {
            allPaths(p + 'D', maze,  row + 1 , col);
        }

        // right
        if(col < maze[0].length - 1){
            allPaths(p + 'R', maze,  row, col  + 1); 
        }

        // up
        if( col > 0 ){
            allPaths(p + 'L', maze,  row, col  - 1);
        }

        // left
        if( row > 0 ){
            allPaths(p + 'U', maze,  row - 1, col);
        }

        // revert the changes which u have made befor the function gets removed , also remove the changes

        maze[row][col] = true ;
    }

    public static void allPathsPrinted(String p , boolean[][] maze , int row, int col, int[][] path, int steps ){

         if(row == maze.length -1  && col == maze[0].length -1 ){
            path[row][col] = steps;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }

        if( maze[row][col] == false){
            return;
        }
        
        // consider this block in my path
        maze[row][col] = false;
        path[row][col] = steps;

        // down
        if(row < maze.length - 1  ) {
            allPathsPrinted(p + 'D', maze,  row + 1 , col , path, steps +1);
        }

        // right
        if(col < maze[0].length - 1){
            allPathsPrinted(p + 'R', maze,  row, col  + 1, path, steps + 1); 
        }

        // up
        if( col > 0 ){
            allPathsPrinted(p + 'L', maze,  row, col  - 1, path, steps + 1);
        }

        // left
        if( row > 0 ){
            allPathsPrinted(p + 'U', maze,  row - 1, col, path, steps + 1);
        }

        // revert the changes which u have made befor the function gets removed , also remove the changes

        maze[row][col] = true ;
        path[row][col] = 0;
    }

    public static void main(String[] args) {

         boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true},  
        };

        int[][] paths = new int[board.length][board[0].length];
    
        //allPaths("", board, 0, 0);

        allPathsPrinted("", board, 0, 0, paths, 0);
        
    }
    
}
