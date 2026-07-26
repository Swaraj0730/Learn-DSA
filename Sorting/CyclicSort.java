package Sorting;

public class CyclicSort {

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp ;
    }

    public static void cyclicSort(int[] arr){
        int i = 0 ; 
        int n = arr.length ;

        while( i < n ){
            int correctIndex = arr[i] - 1 ;

            if(arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }
            else{
                i++ ;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 1, 4} ;
        cyclicSort(arr);

        for(int i : arr){
            System.out.println(i);
        }
        


         
    }
    
}
