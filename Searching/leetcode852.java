package Searching;

// Finding the peak of the mountain array 

public class leetcode852 {

    public static int PeakElement(int arr[]){
        int start = 0 ; 
        int end = arr.length -1 ;

        while(start <= end ){
            int mid = start+(end-start)/2 ;
            if( arr[mid] > arr[mid + 1]){
                if(arr[mid] > arr[mid -1] ){
                    return arr[mid];
                }
                else{
                    end = mid - 1 ;
                }
            }
            else{
                start = mid + 1;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 5, 3, 2};
        System.out.println(PeakElement(arr));
    }
    
}
