public class MoveZerosToEnd {

    public static void moveZeroesToEnd(int[] nums){
        int zeroCount = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[zeroCount] = nums[i];
                zeroCount++;
            }
        }
        for(int i = zeroCount ; i < nums.length ; i++){
            nums[i] = 0;
        }
      
    }
    public static void main(String[] args) {
        int[] nums = {0,1,4,0,5,2};
        moveZeroesToEnd(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
 
    
}
