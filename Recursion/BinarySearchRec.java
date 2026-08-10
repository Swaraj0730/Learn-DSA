package Recursion;

public class BinarySearchRec {

    public static int BSrec(int arr[], int target, int start, int end){

        if(arr.length == 0 ){
            return -1 ;
        }

        while(start < end){
            int mid = start + (end-start)/2 ;

            if(arr[mid] == target){
                return mid ;
            }

            else if( arr[mid] > target){
                BSrec(arr, target, start, mid);
            }
            else{
                BSrec(arr, target, mid+1, end);
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 5, 4, 7, 9};
        int target = 5 ;

        System.out.println(BSrec(arr, target, 0, arr.length));
    }
}
