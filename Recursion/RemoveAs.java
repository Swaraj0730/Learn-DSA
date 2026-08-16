package Recursion;

public class RemoveAs {

    public static void remove(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            remove(p, up.substring(1));
        }
        else{
            remove(p + ch, up.substring(1));
        }
    }

    public static String remove2(String up){

        if(up.isEmpty()){
            return " ";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return remove2(up.substring(1));
        }
        else{
            return ch + remove2(up.substring(1));
        }
    }

    public static String removeApple(String up){

        if(up.isEmpty()){
            return " ";
        }
        
        if(up.startsWith("apple")){
            return removeApple(up.substring(5));
        }
        else{
            return up.charAt(0) + removeApple(up.substring(1));
        }
    }

    public static String removeAppNotApple(String up){

        if(up.isEmpty()){
            return " ";
        }
        
        if(up.startsWith("app") && !up.startsWith("apple")){
            return removeAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0) + removeAppNotApple(up.substring(1));
        }
    }
    public static void main(String[] args) {

        remove("", "baccdah");
        System.out.println(remove2("baccdah"));
        System.out.println(removeApple("bcaaapplefgh"));
        System.out.println(removeAppNotApple("bcaappapplefgh"));
        
        
    }
    
}
