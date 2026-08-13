package Mis;
public class Leetcode238 {

    public static int[] findProduct(int arr[]){

        int[] result = new int[arr.length];

        result[0] = 1 ;
        for(int i = 1 ; i < arr.length ; i++){
            result[i] = result[i-1] * arr[i-1] ;
        }
        int suffix = 1 ;
        for(int i = arr.length-1 ; i >= 0 ; i--){
            result[i] = result[i] * suffix ;
            suffix = suffix * arr[i];

        }

        return result ;
    }
    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 4, 5};
        int[] result = findProduct(arr);

        for(int i : result){
            System.out.println(i);
        }
        
    }
    
}
