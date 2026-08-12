package BitWise;

public class leetcode832 {

    public int[][] findAndInvertImage(int[][] image){

        for(int[] row : image){
            for(int i = 0 ; i < (image[0].length + 1)/2 ; i++){
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ;
                row[image.length - i - 1] = temp ;
            }
        }
        return image ;
    }

    public static void main(String[] args) {

    
    }
    
}
