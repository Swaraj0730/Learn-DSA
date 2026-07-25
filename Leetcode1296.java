import java.util.*;


public class Leetcode1296{

    public static void canDivide(int arr[], int k){

        if(arr.length%k != 0){
            System.out.println("Not possible");
        }

        ArrayList<Set<Integer>> list = new ArrayList<>();
        int count = 0 ;

        for(int i = 0 ; i < arr.length/k ; i++){
            list.add(new HashSet<>());
        } 
        while (count < list.size()) {
            for(int i = 0 ; i < k  ; i++ ){
                list.get(count).add(arr[i]);
            }
            count++;
        }
        System.out.println(list);
        int size = list.get(0).size();
        boolean temp = true;

        for(Set<Integer> sets : list){
            if(sets.size() != size ){
                temp = false ;
                break;
            }
            temp = true ;
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {

        int[] arr = {3,2,1,2,3,4,3,4,5,9,10,11};
        int k = 3 ;
        
        canDivide(arr, k);
        
    }
}

/// not done will be done using a tree map
/// 