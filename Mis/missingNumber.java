package Mis;
import java.util.Arrays;

public class missingNumber{

    public static int CyclicSort(int nums[]){
        int n = nums.length;
        int i = 0 ;

        while( i < n) {
            int correctIndex = nums[i];

            if(nums[i] < n && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++ ;
            }
        }
        for(int j = 0 ; j < n ; j++ ){
            if(nums[j] != j ){
                return j ;
            }
        }
        return n ;
    }

    public static int missingNumUsingXor(int[] nums){

        int xor = nums.length ;

        for(int i = 0 ; i < nums.length ; i++ ){
            xor ^= i^nums[i] ;
        }
        return xor ;
    }

    public static int missingNumUsingSum(int nums[]){

        int expectedSum = 0 ;
        int n = nums.length ;
        int actualSum = (n*(n+1))/2 ;
        int i = 0 ;
        while( i < nums.length ){
            expectedSum = expectedSum + nums[i] ;
            i++;
        }
        return actualSum - expectedSum ;
    }

    public static int missingNum(int[] nums){
        Arrays.sort(nums) ;
        int n = nums.length;
        for(int val : nums){
            System.out.println(val);
        }
        int result = 0 ;

        for(int i = 0 ; i < n ; i++ ){

            if(nums[0] != 0)
                return 0 ;

            if(i == nums.length-1){
                return nums[i] + 1 ; 
            }

            if( nums[i] + 1 != nums[i+1] ){
                result = nums[i]+1 ;
                break ;
            }
            
        }
        return result  ;
    }

    public static void main(String[] args) {
        int[] nums = {0,1, 2, 4, 5, 6};
        int result1 = missingNum(nums);
        System.out.println(result1);

        int cycsortresult = CyclicSort(nums);
        System.out.println(cycsortresult);

        int result2 = missingNumUsingSum(nums);
        System.out.println(result2);

        int result3 = missingNumUsingXor(nums);
        System.out.println(result3);
    }
}