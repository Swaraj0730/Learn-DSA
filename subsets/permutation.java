package subsets;

import java.util.ArrayList;

public class permutation {

    public static void Permutation(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);

        for(int i = 0 ; i <= p.length() ; i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            Permutation(f + ch+ s, up.substring(1));
        }
    }

    public static ArrayList<String> permArrayList(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        char ch = up.charAt(0);
        ArrayList<String> str = new ArrayList<>() ;
        for(int i = 0 ; i <= p.length() ; i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            str.addAll(permArrayList(f + ch+ s, up.substring(1)));     
        }
        return str;
    }

    public static void main(String[] args) {
        
        Permutation("", "abc");
        System.out.println(permArrayList("","abc"));
    }
    
}
