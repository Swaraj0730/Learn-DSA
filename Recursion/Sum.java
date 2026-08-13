package Recursion;

public class Sum {

    public static int SumNth(int n){

        if(n <= 0){
            return 0;
        }

        return n + SumNth(n-1);
    }

    public static void main(String[] args) {

        System.out.println(SumNth(5));
        
    }
    
}
