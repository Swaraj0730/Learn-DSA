package Mis;
public class twoSum {

    public static int[] TwoSum(int nums[], int target){
        

        for(int i = 0 ; i < nums.length ; i++){
            int diff = target- nums[i];
            for(int j = i+1 ; j < nums.length ; j++ ){
                if(diff == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[] = {1, 6, 2, 10, 3};
        int target = 7 ;
        int[] result = TwoSum(nums, target);

        for(int num : result){
            System.out.print(num+" ");
        }

    }
    
}
