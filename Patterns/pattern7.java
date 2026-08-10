package Patterns;

public class pattern7 {

    public static void main(String[] args) {

        int n = 5 ;

        for(int i = 0 ; i < 2*n ; i++){
            int totalColInRows = i > n ? 2 * n - i : i ;

            int noSpaces = n - totalColInRows ;
            for(int s = 0 ; s < noSpaces ; s++){
                System.out.print(" ");
            }

            for(int col = 0 ; col < totalColInRows ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }   
        
    }
    
}
