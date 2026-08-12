package BitWise;

public class findIthbit {

    public static void main(String[] args) {

        int num = 0b10101101 ;
        int i = 3 ;

        int ithbit = (num >> (i-1)) & 1 ;

        System.out.println(ithbit);
        

    }
    
}
