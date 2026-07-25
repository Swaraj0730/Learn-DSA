import java.util.HashSet;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {

        int []temp = new int[nums.length];
        int j = 0 ;

        for(int i = 0 ; i < nums.length-1 ; i++){
            if (nums[i] != nums[i+1]){
                temp[j] = nums[i];
                j++;
            }
        }
        temp[j] = nums[nums.length - 1];
        j++;

        return temp.length ;
    }


    public static void main(String[] args) {
        int nums[] = {0, 0, 3, 3, 5, 6};
        int count = removeDuplicates(nums);
        System.out.println(count);
    }
    
}
