package Recursion;

public class BubbleSortRecursion {

    public static void bubbleSortRec(int[] arr, int r, int c){

        if( r == 0 ){
            return;
        }

        if( c < r ){

            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp ;
                bubbleSortRec(arr, r, c+1);
            }
            else{
                bubbleSortRec(arr, r - 1, 0);
            }
        }
       
    }

    public static void main(String[] args) {

        
    }
    
}
