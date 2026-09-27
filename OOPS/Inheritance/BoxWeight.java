package OOPS.Inheritance;

public class BoxWeight extends Box {

    double weight ;

    public BoxWeight(){
        this.weight = -1 ;
    }

    public BoxWeight(double l, double w, double h , double weight){
        super(l, w, h);
        this.weight = weight ;
    }


}
