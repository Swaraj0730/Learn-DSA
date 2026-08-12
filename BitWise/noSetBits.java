package BitWise;

public class noSetBits {

    public static void main(String[] args) {
        
        int num = 45 ;
        int ones = 0 ;

        for(int i = 0 ; i < 32 ; i++){
            if(((num >> i)& 1) == 1){
                ones++ ;
            }
        }
        System.out.println(ones);
    }
    
}
