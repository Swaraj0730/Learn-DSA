package subsets;

import java.util.ArrayList;

public class rollDice {

    public static void roll(String p , int target){
        if(target == 0 ){
            System.out.println(p);
            return ;
        }

        for(int i = 1 ; i <= 6 && i <= target ; i++){
            roll( p + i , target - i);
        }
    }

    public static ArrayList<String> rollList(String p , int target){
        if(target == 0 ){
            ArrayList<String> str = new ArrayList<>();
            str.add(p);
            return str;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1 ; i <= 6 && i <= target ; i++){
            list.addAll(rollList( p + i , target - i));
        }
        return list ; 
    }

    public static void rollwithFace(String p , int target , int face){
        if(target == 0 ){
            System.out.println(p);
            return ;
        }

        for(int i = 1 ; i <= face && i <= target ; i++){
            rollwithFace(p + i , target - i , face);
        }
    }



    public static void main(String[] args) {

        // roll("", 4);
        // System.out.println(rollList("", 4));
        // rollwithFace("", 4, 7);
        
    }
    
}
