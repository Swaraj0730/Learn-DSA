package OOPS.Inheritance;

public class Box {

    double length;
    double height;
    double width;

    Box(){
        this.height = -1 ;
        this.length = -1 ;
        this.width =  -1 ;
    }

    Box(double side){
        this.width = side ;
        this.length = side ;
        this.height = side ;
    }

    Box(double length, double width, double height){
        this.width = width ;
        this.length = length ;
        this.height = height ;
    }

    Box(Box oldBox){
        this.height = oldBox.height ;
        this.width = oldBox.width ;
        this.length = oldBox.length ;
    }

    public void information(){
        System.out.println(" running the box ");
    }
}
