import java.util.*;
public class Try{


    public static long count_pairs(int N, int rectangles[][]){
        long result = 0 ;
        int [][] results = new int[N][2];
        int k = 0 ;

        while(k < rectangles[0].length){
            for(int i = 0 ; i < rectangles.length ; i++){
                for(int j = 0 ; j < rectangles[0].length ; j++){
                    results[i][j] = rectangles[i][k] / rectangles[k][j];
                }
            }
            k++ ;
        }

        for(int i = 0 ; i < rectangles.length ; i++){
                for(int j = 0 ; j < rectangles[0].length ; j++){
                    System.out.println(results[i][j]);
                }
            }

        
        return result ;
    }

    public static void main(String[] args) {

        int N = 5;
        int rectangles[][] = {
                        {1, 2},
                        {3, 4},
                        {7, 4},
                        {2, 5},
                        {3, 6}
        };
        count_pairs(N, rectangles);

    }

}