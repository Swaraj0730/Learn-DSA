package OOPS.Inheritance;

public class Main {

    public static void main(String[] args){

        Box box = new Box();

        BoxWeight bw = new BoxWeight(1, 4, 6, 8);
        System.out.println(bw.weight + " , " + bw.length + " , " + bw.width + " , " +  bw.height);

    }
}
