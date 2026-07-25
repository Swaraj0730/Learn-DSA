package Searching;

public class OrderAgnosticBS {

    public static int orderagnosticBS(int arr[], int target){

        
        int start = 0 ; 
        int end = arr.length -1 ;

        boolean isAsc = arr[start] < arr[end] ;

        while(start <= end ){
            int mid = start + (end-start)/2 ;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1 ;
                }
                else{
                    start = mid + 1 ;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid+1; 
                }
                else{
                    end = mid-1 ;
                }
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {

        int[] arr2 = {2, 3, 4, 6, 7, 8, 9, 10, 18}; 
        int target = 3;

        System.out.println(orderagnosticBS(arr2, target));
        
    }
    
}
