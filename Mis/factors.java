package Mis;

import java.util.ArrayList;

public class factors {

    public static void main(String[] args) {

        int n = 20 ;

        // for(int i = 1 ; i <= 20 ; i ++){
        //     if( n % i == 0){
        //         System.out.println(i + " ");
        //     }
        // } O(n)

        // for(int i = 1; i < Math.sqrt(n) ; i++){
        //     if( n % i == 0 ){
        //         if( n/i == i){
        //             System.out.print(i);
        //         }else{
        //             System.out.print(i + " " + n/i + " ");
        //         }
        //     }
        // }

        ArrayList<Integer> list = new ArrayList<>() ;

        for(int i = 1; i < Math.sqrt(n) ; i++){
            if( n % i == 0 ){
                if( n/i == i){
                    System.out.print(i);
                }else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for(int i = list.size() - 1; i >= 0  ; i--){
            System.out.print(list.get(i)+ " ");
        }
    }
    
}
