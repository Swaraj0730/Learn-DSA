package BitWise;

// every number appear 3 times and single number appears 1 times find that number

public class aloneNumberII {

    public static int AloneNumberII(int[] arr){

        int result = 0 ; 

        for(int i = 0 ; i < 32 ; i++){
            int count = 0 ; 

            for(int num : arr ){
                if(((num >> i) & 1) == 1){
                    count++;
                }
            }

            if (count%3 != 0){
                result = result | (1<<i);
            }
        }
        return result ;

    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        System.out.println(AloneNumberII(arr));
        
    }
    
}
