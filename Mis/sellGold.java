package Mis;

public class sellGold {

    public static int sell(int[] arr, int k){
        int sum = 0 ;

        int left = 0 ;
        int right = k  ;

        while(left <= right){
            sum += arr[left] * (left+1) ;

            if( left != right) {
                sum += arr[right] * (right + 1);
            }

            left++;
            right--;
        }
        return sum ;
    }

    public static void main(String[] args){

        int[] arr = {2, 3, 5, 6, 8, 7};
        int k = 5 ;

        System.out.println(sell(arr, k));

    }
}
