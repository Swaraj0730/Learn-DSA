package BitWise;

public class oddeven {

    public static boolean isodd(int n){
        return (n&1) == 1 ;
    }

    public static void main(String[] args) {
        int n = 67 ;
        System.out.println(isodd(n));

       
    }   
}
