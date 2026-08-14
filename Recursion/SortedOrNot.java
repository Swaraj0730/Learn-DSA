package Recursion;

public class SortedOrNot {

    public static boolean sortedOrNot(int[] arr, int i ){

        if(i == arr.length-1){
           return true ;
        }

        if(arr[i] < arr[i+1]){
            return sortedOrNot(arr, i+1);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 6, 7};
        System.out.println(sortedOrNot(arr, 0 ));
        
    }
    
}
