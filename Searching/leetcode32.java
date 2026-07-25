package Searching;

// find the first and the last position of element in sorted array
public class leetcode32 {

    public static int[] searchRange(int nums[], int target){

        int[] ans = {-1, -1};

        int start = Search(nums, target, true);
        int end = Search(nums, target, false);

        ans[0] = start; 
        ans[1] = end ;

        return ans ;
    }

    public static int Search(int nums[], int target, boolean findfirstidx){

         if(nums.length == 0 ){
            return -1;
        }
        int ans = -1;
        int start = 0 ; 
        int end = nums.length -1;

        while(start <= end){
            int mid = start+(end-start)/2 ;

            if( target > nums[mid]){
                start = mid+1;
            }
            else if( target < nums[mid]){
                end = mid-1;
            }
            else{
                // potential answer found

                ans = mid ;

                if(findfirstidx){
                    end = mid -1 ;
                }
                else{
                    start = mid+1 ;
                }
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 7;

        int[] res = searchRange(nums, target); 

        for( int i : res){
            System.out.println(i);
        }
    }
}
