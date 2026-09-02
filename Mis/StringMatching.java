package Mis;

public class StringMatching {

    public static void main(String[] args){

        String a = "Kunal";
        String b = "ApporvKunalRahul";

        for(int i = 0 ; i <= b.length() - a.length() ; i++){
            int j = 0 ;
            while( j < a.length() && b.charAt(i+j) == a.charAt(j)) {
                j++;
            }
        }

    }
}
