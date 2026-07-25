package Searching;

public class RotationCount {

    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end ){
            int mid = start + (end - start)/2 ;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid + 1  ;
            }
            if(start < mid && arr[mid] > arr[mid-1]){
                return mid - 1 ;
            }

            if( arr[start] <= arr[end]){
                start = mid + 1 ;
            }
            else{
                end = mid - 1; 
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int ans = pivot(arr);
        System.out.println(ans);
    }
    
}
