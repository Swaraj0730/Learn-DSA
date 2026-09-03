package Mis;

import java.util.Stack;

// leetcode 2390
public class removeStar {

    public static void remove(String s){

        Stack<Character> stk = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != '*') {
                stk.push(s.charAt(i));
            }
            else{
                stk.pop();
            }
        }

        for(char ch : stk){
            System.out.print(ch);
        }
    }

    static void main() {
        String s = "leet**cod*e" ;
        remove(s);


    }
}
