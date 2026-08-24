package Mis;

import java.util.Stack;

public class Try{
    static void main() {

        Stack<Character> stack = new Stack<>() ;
        String s = "))())(";
        char[] ch  = s.toCharArray() ;

        for(char c : ch){
            if( c == ')'){
                if( !stack.isEmpty() || stack.peek() == '('){
                    stack.pop() ;
                }
                stack.push(c) ;
            }
        }
    }







}