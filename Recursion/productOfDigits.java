package Recursion;

public class productOfDigits {

    public static int product(int a){

        if(a < 10 ){
            return a ;
        }

        return a%10 * product(a/10);
    }

    public static void main(String[] args) {

        System.out.println(product(505));
        
    }
    
}
