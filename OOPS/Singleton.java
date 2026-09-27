package OOPS;

public class Singleton {

    private Singleton() {

    }

    private static  Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton() ;
        }
        return instance ;
    }


    static void main() {

        Singleton instance = new Singleton() ;
        Singleton instance2 = new Singleton() ;
    }
}
