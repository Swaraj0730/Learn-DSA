package Searching;

// leetcode 744 find the smallest letter  greater than the target
public class leetcode744 {

    public static char nextGreaterLetter(char[] letters, char target){

        int start = 0 ;
        int end = letters.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target < letters[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1 ;
            }
        }
        return letters[start%letters.length] ;
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreaterLetter(letters, target));
    }
    
}
