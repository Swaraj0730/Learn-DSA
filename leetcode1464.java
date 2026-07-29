import java.util.*;

public class leetcode1464 {

    public static int maxProduct(int[] nums){

        Arrays.sort(nums);

        int n = nums.length ;

        int p1 = nums[n-1] * nums[n - 2] * nums[n - 3];
        int p2 = nums[0] * nums[1] * nums[n-1] ;

        return Math.max(p1, p2);    
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 5};
        maxProduct(nums);
    }
    
}
