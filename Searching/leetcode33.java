package Searching;

// Search in a rotated sorted array

public class leetcode33 {

    public static int Bs(int[] arr, int target , int start, int end){

        while (start <= end ){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid ;
            }
            else if(arr[mid] > target){
                end = mid - 1 ;
            }
            else{
                start = mid + 1 ;
            }
        }
        return -1 ;
    }

    public static int pivot(int[] arr){

        int start = 0 ; 
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end-start)/2 ;
            if( mid < end && arr[mid] > arr[mid+1]){
                return mid ;
            }

            if( mid > start && arr[mid] < arr[mid-1]){
                return mid - 1 ;
            }

            if( arr[start] <= arr[mid] ){
                start = mid + 1 ;
            }

            else{
                end = mid - 1 ;
            }
        }
        return -1 ;
    }

    // finds the pivot with the duplicate values
    public static int pivotWithDup(int[] arr){

        int start = 0 ; 
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end-start)/2 ;
            if( mid < end && arr[mid] > arr[mid+1]){
                return mid ;
            }

            if( mid > start && arr[mid] < arr[mid-1]){
                return mid - 1 ;
            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // check if these elements at the start and end were the pivot

                if( arr[start] > arr[start+1]){
                    return start ;
                }
                start++;

                if( arr[end] < arr[end-1]){
                    return end ;
                }
                end--;
            }
            // left side is sorted, so pivot should be in rigth 
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])){
                start = mid + 1;
            }
            else{
                end = mid - 1 ;
            }
        }
        return -1 ;
    }

    public static int Search(int[] arr, int target){

        int pivot = pivot(arr);

        // if no pivot was found then the array is normal 
        if(pivot == -1){
            Bs(arr, target, 0, arr.length-1);
        }

        // if pivot was found we have found 2 sorted arrays
        if( arr[pivot] == target ){
            return pivot;
        }

        if(target >= arr[0] ){
            return Bs(arr, target, 0 , pivot);
        }

        return Bs(arr, target, pivot + 1, arr.length-1) ;
    }

    // works with duplicate values 
    public static int SearchWithDup(int[] arr, int target){

        int pivot = pivotWithDup(arr);

        // if no pivot was found then the array is normal 
        if(pivot == -1){
            Bs(arr, target, 0, arr.length-1);
        }

        // if pivot was found we have found 2 sorted arrays
        if( arr[pivot] == target ){
            return pivot;
        }

        if(target >= arr[0] ){
            return Bs(arr, target, 0 , pivot);
        }

        return Bs(arr, target, pivot + 1, arr.length-1) ;
    }

    public static void main(String[] args) {

        int arr[] = {2, 9, 2, 2, 2, 2};
        int target = 9 ;

        int ans  = SearchWithDup(arr, target);
        System.out.println(ans);

        int ans2 = Search(arr, target);
        System.out.println(ans2);
    }
    
}
