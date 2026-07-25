package Sorting;

public class SelectionSort {

    public static void swap(int arr[], int a, int b){
        
        int temp = arr[a];
        arr[a] = arr[b] ;
        arr[b] = temp;
    }

    public static void selectionSort(int[] arr){

        for(int i = 0 ; i < arr.length ; i++ ){
            int last = arr.length - i - 1 ;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }

    }

    public static int getMaxIndex(int[] arr, int start, int end){
        
        int max = start;
        for(int i = 0 ; i <= end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max ;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selectionSort(arr);

        for(int i : arr){
            System.out.println(i);
        }
    }
    
}
 