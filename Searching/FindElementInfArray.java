package Searching;

//  To find an element in an infinite array
//  Assume that the array is infinite and dont use the length function

public class FindElementInfArray {

    public static int BinarySearchInf(int arr[], int target, int start , int end){
        
        while(start <= end){
            int mid = start + (end-start)/2;

            if( target < arr[mid] ){
                end = mid - 1;
            }
            else if ( target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid ;
            }
        }
        return -1 ;
    }

    public static int ans(int[] arr, int target){
        // first start with the range of box 2

        int start = 0 ; 
        int end = 1 ;

        // condition for the target to lie in the range 
        while(target > arr[end]){
            int temp = end + 1 ; 
            end = end + ( end - start + 1 ) * 2 ;
            start = temp ;
        }
        return BinarySearchInf(arr, target, start, end); 
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int target = 10 ;

        int ans = ans(arr, target) ;
        System.out.println(ans);
    }
}
