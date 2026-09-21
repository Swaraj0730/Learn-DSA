package Mis.Accenture;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class question2 {

    static void main() {

        int[] arr = {4, 2, 2, 2, 3 , 5, 7, 2, 2};
//        Arrays.sort(arr);
//        int n = 5 ;
//        int ans = 0 ;
//        for(int i = 0 ; i < arr.length - 1 ; i++){
//            if(i < arr.length && arr[i] + 2 != arr[i+1]) {
//                ans = arr[i]  + 2 ;
//            }
//            else{
//                ans = arr[arr.length - 1] + 2 ;
//            }
//        }
//        System.out.println(ans);

        System.out.println(majorityElement(arr, arr.length));
    }

    public static int findMissing(int arr[] , int size){
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);

        for(int i : arr){
           map.put(i, map.getOrDefault(i, 0) + 1) ;
        }

        for(int i = 2 ; i <= size * 2 ; i+=2){
            if(!map.containsKey(i)){
                return i ;
            }
        }
        return -1 ;
    }

    public static int majorityElement(int[] arr, int len){

        HashMap<Integer, Integer> map = new HashMap<>() ;

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key) > len/2){
                return key ;
            }
        }
        return 0;
    }
}
