package StackQueue;

import java.util.Arrays;
import java.util.Stack;

public class TwoStacks {

    private static int helper(int allowedSum, int[] a, int[] b, int sumSoFar, int count ){

        if( sumSoFar > allowedSum){
            return count ;
        }

        if(a.length == 0 || b.length == 0){
            return count ;
        }

        int ans1 = helper(allowedSum, Arrays.copyOfRange(a, 1, a.length), b, sumSoFar + a[0], count+1);
        int ans2 = helper(allowedSum, a, Arrays.copyOfRange(b, 1, b.length), sumSoFar + b[0], count+1);

        return Math.max(ans1, ans2);
    }

    public static int twoStack(int[] stk1 , int[] stk2 , int maxSum ){
        return helper(maxSum, stk1, stk2, 0, 0) - 1 ;
    }

    public static int twoStackIter(int[] a, int[] b , int maxSum ){

        int count = 0 ;
        int currSum = 0 ;

        int i = 0 ;

        while( i < a.length && currSum + a[i] <= maxSum){
            currSum += a[i] ;
            count++ ;
            i++ ;
        }

        int maxCount = count ;

        for(int j = 0 ; j < b.length ; j++){
            currSum += b[j];
            count++ ;

            while(currSum > maxSum && i > 0){
                i-- ;
                currSum -= a[i] ;
                count-- ;
            }
            if( currSum <= maxSum){
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount ;
    }

    public static void main() {

        int[] a = {1, 2, 3, 4, 5} ;
        int[] b = {4, 6, 7, 3};

        int ans = 10 ;

        System.out.println(twoStack(a, b, ans));

        System.out.println(twoStackIter(a, b, ans));

    }
}
