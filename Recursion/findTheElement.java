package Recursion;

public class findTheElement {

    public static int findNumber(int[] arr, int index ,int target){

        if( arr.length == index){
            return -1 ;
        }

        if( arr[index] == target){
            return index;
        }

        if( arr[index] != target){
            return findNumber(arr, index + 1, target);
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7};

        int target = 1;

        System.out.println(findNumber(arr, 0, target));
        
    }
    
}
