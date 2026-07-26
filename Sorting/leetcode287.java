package Sorting;

public class leetcode287 {

    public static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b] ;
        arr[b] = temp ;
    }

    public static int findDuplicate(int[] arr){

        int i = 0 ; 
        int n = arr.length;


        while( i < n ){
            if( arr[i] != i + 1 ){
                int index = arr[i] - 1 ;

                if(arr[i] != arr[index]){
                    swap(arr, i, index);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++ ; 
            }
            
        }
        return -1 ;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
        
    }
    
}
