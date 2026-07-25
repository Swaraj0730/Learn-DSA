package Searching;

// split array largest sum 
// divide the array into m parts such that they have the least sum

public class leetcode410 {

    public static int splitArray(int[] arr, int m){

        int start = 0 ;
        int end = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            start = Math.max(start, arr[i]) ;
            end += arr[i] ;
        }

        // apply the binary search

        while (start < end) {
            int mid = start + (end-start)/2;

            // calculate how many pieces you can divide this in with this. max sum
            int sum = 0 ;
            int pieces = 1 ;

            for(int num : arr){
                if(sum + num > mid){
                    // cannot be added to the same array 
                    // new sub array should be created
                    sum = num ;
                    pieces++ ;
                }
                else{
                    sum += num ;
                }
            }
             
            if(pieces > m){
               start = mid + 1;
            }
            else{ 
                end = mid ;
            }
        }
        return end ;
    }
    public static void main(String[] args) {     

        int[] arr = {7 ,2 ,5 ,10 ,8};
        int k = 2 ;  
        int ans = splitArray(arr, k);
        System.out.println(ans);
        
    }
    
}
