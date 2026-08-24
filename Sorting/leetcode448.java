package Sorting;

import java.util.*;
// find all the diapeared number 
public class leetcode448 {

    public static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b] ;
        arr[b] = temp ;
    }
    public static List<Integer> findDisappearedIntegers (int[] nums){

        List<Integer> list = new ArrayList<>();
        int n = nums.length ;
        int i = 0 ;

        while( i < n ){
            int correctIndex = nums[i] - 1 ;

            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex) ;
            }
            else{
                i++;
            }
        }

        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != j + 1 ){
                list.add(j + 1);
            }
        }
        return list ;
    }

    public static void main(String[] args) {

        int[] nums =  {4, 3, 2, 7, 8, 2,  3, 1};
        List<Integer> ans = findDisappearedIntegers(nums);

        for(int i : ans){
            System.out.println(i);
        }
        
    }
    
}
