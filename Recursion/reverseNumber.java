package Recursion;

public class reverseNumber {

    static int sum = 0 ;

    public static void reverse(int a) {

        if( a == 0){
            return ;
        }
        int rem = a%10 ;
        sum = sum * 10 + rem ;
        reverse(a/10);
    } 

    public static void main(String[] args) {

        reverse(456);
        System.out.println(sum);
        
    }
}
