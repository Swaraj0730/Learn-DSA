import java.util.*;

public class RankElements {

    public static void RankElem(int arr[]){

        int dummy[] = arr.clone();
        Arrays.sort(dummy);

        int rank = 1 ;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < dummy.length ; i++){
            if(!map.containsKey(dummy[i]))
            map.put(dummy[i],rank++);
        }

        for (int i = 0 ; i< arr.length ; i++){
            arr[i] = map.get(arr[i]);
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {37,12,28,9,100,56,80,5,12};

        RankElem(arr);
    
    }
}
