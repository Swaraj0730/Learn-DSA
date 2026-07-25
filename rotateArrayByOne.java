public class rotateArrayByOne {
    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3%nums.length;
        while( k > 0 ){
            int change = nums[0] ;
            for(int i = 0 ; i < nums.length-1 ; i++){
                nums[i] = nums[i+1];
            }
            nums[nums.length-1] = change ;
            k-- ;
        }
        for(int num : nums){
            System.out.println(num);
        }
    }
}
                           