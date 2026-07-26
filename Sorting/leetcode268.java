package Sorting;
// find the missing number

public class leetcode268 {

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a] ; 
        arr[a] = arr[b] ;
        arr[b] = temp ;

    }


    public static int missingNumber(int[] arr){

        int i = 0 ; 
        int n = arr.length ; 

        while( i < n ){
            int correctIndex = arr[i] ; 
            if(arr[i] < n && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++ ; 
            }
        }

        for(int j = 0 ; j < n ; j++){
            if(arr[j] != j){
                return j;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int arr[] = {0,1};

        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    
}
