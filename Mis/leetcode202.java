package Mis;

public class leetcode202 {

    private static int findSquare(int n){
        int ans = 0 ;

        while( n > 0 ){
            int rem = n % 10 ;
            ans += rem*rem ;
            n = n /10 ;
        }
        return ans ;
    }

    public static boolean isHappy(int num){

        int slow = num ;
        int fast = num ;
        

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow) ;

        if(slow == 1){
            return true ;
        }
         return false ;
    }

    public static void main(String[] args) {
        
    }
    
}
