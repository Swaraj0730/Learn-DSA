package Searching;

import java.util.Arrays;

public class Sorted2dMatrix {

    public static int[] search(int[][] matrix, int target){

        int rows = matrix.length ;
        int cols = matrix[0].length ;

        if(rows == 0 && cols == 0){
            return new int[]{-1, -1};
        }

        if( rows == 1) {
            return BinarySearch(matrix, 0, 0, cols-1, target);
        }

        // runt the loop till two rows are remaining

        int rStart = 0;
        int rEnd = rows - 1 ;
        int cMid = cols/2 ;

        while( rStart < (rEnd - 1)){ // while this is true there will be more than two rows 

            int mid = rStart + (rEnd - rStart)/2 ;
            
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }

            if(matrix[mid][cMid] < target){
                rStart = mid ;
            }
            else{
                rEnd = mid ;
            }
        } 
        // now we have 2 rows 
        // check wether the target is in the col of 2 rows

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }

        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }

        //Search in the 4 halfes

        if(target <= matrix[rStart][cMid-1]){
            return BinarySearch(matrix, rStart, 0, cMid - 1 , target);
        }
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols - 1]){
            return BinarySearch(matrix, rStart, cMid + 1, cols - 1 , target);
        }

        if(target <= matrix[rStart+1][cMid-1]){
            return BinarySearch(matrix, rStart + 1, 0, cMid - 1 , target);
        }
        else{
            return BinarySearch(matrix, rStart + 1, cMid + 1, cols - 1 , target);
        }
    }

    public static int[] BinarySearch(int matrix[][], int row, int cStart, int cEnd, int target){
        while( cStart < cEnd ){
            int mid = cStart + ( cEnd - cStart)/2 ;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1} ;
    }

    public static void main(String[] args) {
        
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {6, 7, 8}};

        int target = 5 ;

        int ans[] = search(matrix, target);

        System.out.println(Arrays.toString(ans));
    }
    
}
