package Mis.Chubbs;

import java.util.Stack;

public class Question1 {

    public static String stringReduce(String str){

        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder() ;

        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i) ;

            if( !stack.isEmpty() && stack.peek() == ch){
                stack.pop() ;
            }
            else{
                stack.push(ch) ;
            }
        }
        for( char ch : stack){
            ans.append(ch);
        }
        return ans.toString() ;
    }

    public static void main() {

        String str = "abbaca" ;
        System.out.println(stringReduce(str));
    }
}
