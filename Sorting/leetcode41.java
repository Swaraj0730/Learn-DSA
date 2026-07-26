package Sorting;

// first missing positive

public class leetcode41 {

    public static void swap (int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b] ;
        nums[b] = temp ;
    }

    public static int findMissingPositive(int[] nums){

        int i = 0 ; 
        int n = nums.length ; 

        while( i < n ){
            int correctIndex = nums[i] - 1 ; 
    
            if(nums[i] > 0 && nums[i] < n && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++ ; 
            }
        }
        for(int k = 0 ; k < n ; k++){
            if(nums[k] != k + 1){
                return k + 1;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {

        int[] nums = {3, 4, -1, 1};
        int ans = findMissingPositive(nums);
        System.out.println(ans);
        
    }
    
}
