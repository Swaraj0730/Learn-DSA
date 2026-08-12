package BitWise;

public class NthMagicNumber {

    public static int magicNumber(int num){

        int magicNumber = 0 ;
        int base = 5 ;
        for(int i = 0 ; i < 32 ; i++){
            int lsb = num&1 ;
            num = num >> 1 ;
            magicNumber += lsb*base ;
            base = base *5 ;
        }
        return magicNumber ;

    }


    public static void main(String[] args) {

        int num = 6 ;
        System.out.println(magicNumber(num));
        
    }
    
}
