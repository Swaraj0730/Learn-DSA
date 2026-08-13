package Recursion;

public class pallindrome {

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

        int n = 121 ;
        reverse(n);

        if(sum == n){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        } 
    }
  
}
