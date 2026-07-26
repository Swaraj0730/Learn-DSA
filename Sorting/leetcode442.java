package Sorting;
import java.util.ArrayList;
import java.util.List ;
// find all duplicates in an array

public class leetcode442 {

    public static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b] ;
        arr[b] = temp ;
    }

    public static List<Integer> findDuplicate(int[] arr){

        int i = 0 ; 
        int n = arr.length ; 

        while( i < n ){
            int correctIndex = arr[i]-1 ; 
            if( arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++ ; 
            }
        }
        List<Integer> list = new ArrayList<>() ;

        for( int j = 0 ; j < n ; j++ ){
            if( arr[j] != j+1){
                list.add(arr[j]);
            }
        }
        return list ;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> ans = findDuplicate(arr);
        System.out.println(ans);
        
    }
    
}
