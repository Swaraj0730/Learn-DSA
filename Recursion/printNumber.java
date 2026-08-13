package Recursion;

public class printNumber {

    public static void print(int n){

        if(n == 5){
            System.out.println(5);
            return ;
        }
        System.out.println(n);
        print(n+1) ;
    }

    public static void funrev(int n){

        if(n==0){
            return;
        }

        funrev(n-1);
        System.out.println(n);
    }

    public static void funrevag(int n){

        if(n==0){
            return;
        }
        
        System.out.println(n);
        funrevag(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        funrevag(5);
        
    }
    
}
