package Recursion;

public class factorial {

    public static int fact(int n){

        if( n <= 1 ){
            return 1 ;
        }
        int f = n * fact(n - 1);

        return f ;

    }

    public static void main(String[] args) {

        int k = fact(5);
        System.out.println(k);
        
    }
    
}
