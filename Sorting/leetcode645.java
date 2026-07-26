package Sorting;
// set mismatched

public class leetcode645 {

    public static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b] ;
        arr[b] = temp ;
    }

    public static int[] findErrorNums(int[] nums){
        int i = 0 ; 
        int n = nums.length ;

        while( i < n ){
            int correctIndex = nums[i]-1 ; 
            if( nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++ ; 
            }
        }
        for(int k = 0 ; k < nums.length ; k++){
            if(nums[k] != k+1){
                return new int[]{nums[k], k + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] ans = {1, 1};
        int [] res = findErrorNums(ans);

        for(int i : res){
            System.out.println(i);
        }
        
    }
    
}
