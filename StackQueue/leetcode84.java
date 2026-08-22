package StackQueue;

import java.util.Stack;


// maximum area under the histogram
public class leetcode84 {

    public static int getMax(int[] height, Stack<Integer> stack, int max, int i ){

        int area ;
        int pop = stack.pop() ;
        if(stack.isEmpty()){
            area = height[pop] * i ;
        }
        else{
            area = height[pop] * ( i - 1 - stack.peek());
        }
        return Math.max(max, area) ;
    }

    public static int largestRectangleArea(int[] height){
        Stack<Integer> stack = new Stack<>() ;
        int max = 0 ;

        stack.push(0);

        for(int i= 0 ; i < height.length ; i++){
            while(!stack.isEmpty() && height[i] < height[stack.peek()]){
                max = getMax(height, stack, max, i);
            }
            stack.push(i) ;
        }
        int i = height.length ;
        while(!stack.isEmpty()){
            max = getMax(height, stack, max, i);
        }
        return max ;
    }

    public static void main() {

    }
}
