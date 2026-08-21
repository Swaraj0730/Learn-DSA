package StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;



public class InBuiltExamples {

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        // stack.push(23);
        // stack.push(24);
        // stack.push(25);
        // stack.push(26);
        // stack.push(27);
        // stack.push(28);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // Queue<Integer> q = new LinkedList<>();

        // q.add(5);
        // q.add(4);
        // q.add(3);
        // q.add(2);
        // q.add(1);

        // System.out.println(q.remove());

        Deque<Integer> dq = new ArrayDeque<>() ;
        dq.add(99);
        dq.addLast(78);
        dq.add(67);
        dq.addFirst(45);

        System.out.println(dq);
    }
    
}
