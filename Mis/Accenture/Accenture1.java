package Mis.Accenture;

// element value ke identical blocks

public class Accenture1 {

    static void main() {
        int[] arr  = {2, 3, 3, 3, 2, 2, 6, 4, 4, 4, 4} ;

        int count = 0 ;
        int i = 0 ;

        while( i < arr.length ){
            int curr = arr[i] ;
            int currCount = 0 ;

            while( i < arr.length && arr[i] == curr){
                currCount++;
                i++ ;
            }

            if(currCount == curr){
                count++ ;
            }
        }

        System.out.println(count);
    }
}
