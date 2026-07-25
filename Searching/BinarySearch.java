package Searching;
public class BinarySearch {

    // works in ascending order arrays
    public static int binarySearch(int arr[] , int target){
        int start = 0 ; 
        int end = arr.length-1;

        while( start <= end ){
            int mid = start + (end-start)/2 ;
            
            if( target < arr[mid]){
                end = mid - 1 ;
            }
            else if (target > arr[mid]){
                start = mid + 1 ;
            }
            else{
                return mid ; 
            }
        }
        return -1 ;
    }

    // for descending order array

    public static int binarySearchdesc(int arr[], int target){
        
        int start = 0 ; 
        int end = arr.length -1 ;

        while(start <= end ){

            int mid = end + (start-end)/2;

            if( target > arr[mid]){
                end = mid - 1 ;
            }

            else if( target < arr[mid]){
                start = mid + 1 ;
            }
            
            else{
                return mid ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 7, 8, 9, 10, 18}; 
        int[] arr2 = {18, 10, 9, 8, 7, 6, 4, 3, 2};
        int target = 10 ;

        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearchdesc(arr2, target));
    }
    
}
