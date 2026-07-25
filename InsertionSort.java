public class InsertionSort {

    public static int[] InsertionSortReccursive(int[] nums , int n){

        if(n == 0 || n == 1){
            return nums ;
        }

        for(int i = 1 ; i < nums.length ; i++ ){
            int current = nums[i];
            int j = i-1 ;
            while(j >= 0 && current < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current ;
        }
        return InsertionSortReccursive(nums, n-1) ;
    }

    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};

        int[] arr = InsertionSortReccursive(nums, nums.length) ;
        for(int num : arr){
            System.out.println(num);
        }
        
    }
    
}
