package Searching;

// find the mountain array
public class leetcode1095 {

    public static int findpeak(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end-start)/2 ;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
               start = mid + 1 ;
            }
        }
        return start ;
    }

    public static int searchHalf(int arr[], int target , int start , int end){

        boolean isAsc = arr[start] < arr[end] ;
        while(start <= end ){

            int mid = start + (end - start)/2 ;

            if(target == arr[mid]){
                return mid ;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1 ;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1 ;
                }
            }
        }
        return -1 ;
    }

    public static int findMountain(int target, int[] arr){

        int start = 0 ;
        int end = arr.length - 1 ;
        int mid = findpeak(arr);

        int idx1 = searchHalf(arr, target, start, mid);
        int idx2 = searchHalf(arr, target, mid + 1, end);

        if(idx1 != -1 && idx2 != -1){
            return Math.min(idx1, idx2) ;
        }
        else if(idx1 == -1 && idx2 != -1){
            return idx2 ;
        }
        if(idx1 != -1 && idx2 == -1){
            return idx1 ;
        }
        return -1 ;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,3,1};
        int target = 3 ;

        int ans  = findMountain(target, arr);
        System.out.println(ans);
        
    }
    
}
