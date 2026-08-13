package Mis;
public class practice{


    public static void main(String[] args) {
        
        int arr[] = {0,1,2,4,5,6};
        int actualSum = 0 ;
        int sum = 0 ;
        int i = 0 ;
        while(i < arr.length){
            actualSum = actualSum + i ;
            sum = sum + arr[i] ;
            i++;
        }
        System.out.println(actualSum);
        System.out.println(sum);
    }
}
