package Strings;

public class pallindrome {

    public static void main(String[] args) {
        
        String s = "abcdcba" ;
        s = s.toLowerCase() ;

        if(s == null || s.length() == 0 ){
            System.out.println("false");
        }
        for(int i = 0 ; i < s.length() ; i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if( start != end){
                System.out.println("false");
            }
        }
        System.out.println("true");   
    } 
}
