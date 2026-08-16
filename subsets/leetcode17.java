package subsets;

import java.util.ArrayList;


// letter combinations 

public class leetcode17 {

    public static void keyPad(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        int digit = up.charAt(0) - '0'; // convert '2' into 2

        for(int i = (digit - 1) * 3 ; i < (digit * 3) ; i++  ){
            char ch = (char) ('a' +  i);

            keyPad(p + ch, up.substring(1));
        }
    }

    public static int keyPadCount(String p, String up){

        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0'; // convert '2' into 2
        int count = 0 ;
        for(int i = (digit - 1) * 3 ; i < (digit * 3) ; i++  ){
            char ch = (char) ('a' +  i);

            count = count + keyPadCount(p + ch, up.substring(1));
        }
        return count ;
    }

    public static ArrayList<String> keyPadList(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p) ;
            return list ;
        }

        int digit = up.charAt(0) - '0'; // convert '2' into 2
        ArrayList<String> ans = new ArrayList<>();
        for(int i = (digit - 1) * 3 ; i < (digit * 3) ; i++  ){
            char ch = (char) ('a' +  i);
            ans.addAll(keyPadList(p + ch, up.substring(1)));
        }
        return ans ;
    }

    public static void main(String[] args) {

        keyPad("", "12");
        System.out.println(keyPadList("", "23"));
        System.out.println(keyPadCount("", "42"));
        
    }
    
}
