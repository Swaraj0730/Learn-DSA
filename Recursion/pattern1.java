package Recursion;

public class pattern1 {

    public static void print(int row ,int col){
        
        if(row == 0 ){
            return ;
        }
        
        if( col < row ){
            System.out.print("*");
            print(row, col+1);
        }
        else{
            System.out.println();
            print( row - 1, 0);
        }
    }

    public static void print2(int row, int col){

        if(row == 0 ){
            return ;
        }
        
        if( col < row ){
            print2(row, col+1);
            System.out.print("*");
        }
        else{
            print2( row - 1, 0);
            System.out.println();
        }

    }

    public static void main(String[] args) {

       // print(4, 0);

        print2(4, 0);
        
    }
    
}
