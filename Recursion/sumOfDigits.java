package Recursion;

public class sumOfDigits {

    public static int sumDigits(int num){

        if(num == 0){
            return 0;
        }

        if(num < 10){
            return num ;
        }

        return num%10 + sumDigits(num/10); 
    }

    public static void main(String[] args) {

        System.out.println(sumDigits(2375));
        
    }
}
