package Mis;

import java.util.HashSet;
import java.util.Set;

public class missingMultiple {


    public static int missingmultiple(int[] arr, int k) {

        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int curr = k ;
        while (set.contains(curr)){
            curr = curr + k ;
        }
        return curr ;
    }

    static void main() {
        int[] arr  = {1, 4, 7, 10, 15};
        int k = 5 ;
        System.out.println(missingmultiple(arr, k));
    }
}
