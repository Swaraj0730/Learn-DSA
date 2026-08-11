import java.util.*;

public class leetcode2296{
    public static int missingInteger(int[] nums){

        int sum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == (nums[i-1] + 1)){
                sum = sum + nums[i];
            }
            else{
                break ;
            }
        }

        Set<Integer> set = new HashSet<>() ;

        for(int n : nums){
            set.add(n);
        }

        while(set.contains(sum)){
            sum++ ;
        }
        return sum ;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 5} ;
        System.out.println(missingInteger(arr));

        
    }
}