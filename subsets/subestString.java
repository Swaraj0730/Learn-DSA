package subsets;

import java.util.ArrayList;

public class subestString {

    public static void subseq(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return ;
        }

        char ch = unprocessed.charAt(0);

        subseq(processed + ch, unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    }

    public static ArrayList<String> subseq1( String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseq1(p + ch, up.substring(1));
        ArrayList<String> right = subseq1(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    public static void subseqAscii(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return ;
        }

        char ch = unprocessed.charAt(0);

        subseqAscii(processed + ch, unprocessed.substring(1));
        subseqAscii(processed, unprocessed.substring(1));
        subseqAscii(processed + (ch+0), unprocessed.substring(1));
    }

    public static void main(String[] args) {

        // subseq(" ", "abc"); 
        // System.out.println(subseq1("", "abc"));
        subseqAscii(" ", "abc");

    }
    
}
