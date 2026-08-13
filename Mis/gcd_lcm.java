package Mis ;

public class gcd_lcm{

    public static int gcd(int a , int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a , a) ;
    }

    public static int lcm (int a , int b){

        int lcm = (a*b) / gcd(a,b);

        return lcm ;
    }

    public static void main(String[] args) {

        System.out.println(gcd(6,8));
        System.out.println(lcm(6, 8));
        
    }
}