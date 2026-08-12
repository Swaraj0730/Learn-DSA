package BitWise;

public class powerOftwo {

    public static void main(String[] args) {
        
        int num = 6 ;
        int ones = 0 ;
        for(int i = 0 ; i < 32 ; i++){
            if(((num >> i)& 1)==1){
                ones++;
            }
        }
        if(ones != 1){
            System.out.println("No");
        }
        else{
            System.out.println("yes");
        }

         // if( n & (n-1) == 0 ) it is power of two
    } 
}
 