package Sorting;

public class InsertionSort {

    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp ;
    }


    public static void insertionSort(int[] arr){

        for(int i = 0 ; i < arr.length - 1 ; i++) {

            for(int j = i+1 ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j , j-1);
                }
                else{
                    break ;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 4, 2};
        insertionSort(arr);

        for(int i : arr){
            System.out.println(i);
        }
        
    }
    
}
