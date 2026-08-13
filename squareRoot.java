package Misc;
public class squareRoot {

    public static double findSquareRoot(int n, int p){

        int start = 0 ; 
        int end = n ;

        double root = 0.0 ;

        while(start <= end){
            int mid = start + (end - start)/2 ;

            if( mid*mid == n){
                return mid;
            }

            if( mid* mid > n){
                end = mid - 1 ;
            }
            else{
                start = mid + 1 ;
            }
        }

        double inc = 0.1;
        for(int i = 0 ; i < p ; i++){
            while(root * root <= n ){
               root = root +  inc ;
            }
            root = root -  inc ;
            inc = inc/ 10 ;
        }  
        return root ;
    }

    public static void main(String[] args) {

        int n = 40;
        int p = 3 ;

        System.out.println(findSquareRoot(n, p));
        
    }
    
}
