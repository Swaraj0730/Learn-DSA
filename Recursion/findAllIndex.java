package Recursion;

import java.util.ArrayList;

public class findAllIndex {

    public static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list ){

        if( index == arr.length){
            return list ;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAll(arr, target, index + 1 , list);
    }

    public static ArrayList<Integer> findAll2(int[] arr, int target, int index ){

        ArrayList<Integer> list = new ArrayList<>();

        if( index == arr.length){
            return list ;
        }

        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBefore = findAll2(arr, target, index + 1 );

        list.addAll(ansFromBefore);

        return list ;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 4, 4, 4, 5, 6, 7};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAll(arr, target, 0, list));

        System.out.println(findAll2(arr, target, 0));
        
    }
    
}
