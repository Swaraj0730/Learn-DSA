package Mis;
public class SecondLargest {

    public static int secondLargest(int[] nums){

        int secLargest = Integer.MIN_VALUE ;
        int largest = Integer.MIN_VALUE ;

        for(int i = 0 ; i < nums.length ; i++ ){
            if( largest < nums[i] ){
                largest = nums[i] ;
            }
            else if (secLargest < nums[i] && nums[i] != largest){
                secLargest = nums[i] ;
            } 
        }
        return secLargest ;
    }
    public static void main(String[] args) {

        int[] nums = {9,8, 8, 7, 6, 5} ;
        int ans = secondLargest(nums) ;
        System.out.println(ans);   
    }
}
