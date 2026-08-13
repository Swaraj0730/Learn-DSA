package Recursion;

public class countZero {

    public static int count(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int count){

        if(n==0){
            return count;
        }

        int rem = n % 10 ;
        if ( rem == 0 ){
            return helper(n/10, count++);
        }
        return helper(n/10, count);

    }

    public static void main(String[] args) {

        System.out.println(count(30032));
        
    }
    
}
