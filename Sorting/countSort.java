package Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countSort {

    public static void Sort(int[] arr){
        if(arr == null || arr.length <= 1){
            return ;
        }

        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num ;
            }
        }

        int[] countArray = new int[max + 1];

        for(int num : arr){
            countArray[num]++ ;
        }

        int index = 0 ;
        for(int i = 0 ; i <= max ; i++){
            while(countArray[i] > 0){
                arr[index] = i ;
                index++ ;
                countArray[i]-- ;
            }
        }
    }

    public static void SortHash(int[] arr){

        if(arr == null || arr.length <= 1){
            return ;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0 ;
        for(int i = min ; i < max ; i++){
            int count = map.getOrDefault(i, 0);
            for(int j = 0 ; j < count ; j++){
                arr[index] = i ;
                index++ ;
            }

        }
    }

    public static void main(String[] args){

        int[] arr ={6, 7, 4, 24, 7, 1, 1};
        SortHash(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
