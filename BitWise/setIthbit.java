package BitWise;

public class setIthbit {

    public static void main(String[] args) {

        int num = 0b10101011 ;
        int i = 3 ;

        int ithbit = num | (1 << (i-1));
        System.out.println(ithbit);
       
    }
    
}
