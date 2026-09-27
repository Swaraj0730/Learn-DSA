package Mis.Chubbs;

public class Question2 {

//    public String permutations(String p, String up){
//
//
//
//    }

    public static boolean checkInclusion(String s1, String s2){

        if(s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        StringBuilder sb = new StringBuilder(s1) ;


        if(s2.contains(s1)){
            return true ;
        }

        if(s2.contains(sb.reverse().toString())){
            return true ;
        }

        return false ;
    }

    public static void main(String[] args){

        String s1 = "ab" ;
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }
}
