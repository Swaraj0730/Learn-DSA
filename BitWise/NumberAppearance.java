package BitWise;

public class NumberAppearance {

    public static int Appearance(int[] nums){
        int xor = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            xor = xor^nums[i] ;
        }
        return xor ;
    }
    

    public static void main(String[] args) {

        int[] nums = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(Appearance(nums));
        
    }
    
}
