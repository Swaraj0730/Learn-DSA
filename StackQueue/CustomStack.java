package StackQueue;

public class CustomStack {

    protected int[] data ;
    private static final int DEFAULT_SIZE = 10 ;

    int ptr = -1 ;
   

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size] ;
    }

    public boolean push(int item) {

       if(isFull()){
           System.out.println("Stack is full");
           return false ;
       }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1 ;
    }

    public boolean isEmpty() {
        return ptr == -1 ;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack Empty");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack Empty") ;
        }
        return data[ptr];
    }

    public static void main(String[] args) throws Exception {

//        CustomStack cstk = new CustomStack(5);
//
//        cstk.push(34);
//        cstk.push(36);
//        cstk.push(37);
//        cstk.push(38);
//
//        System.out.println(cstk);
//
//        while (!cstk.isEmpty()) {
//            int val = cstk.pop();
//            System.out.println(val);
//        }
        DynamicStack ds = new DynamicStack(5);

        ds.push(21);
        ds.push(22);
        ds.push(23);
        ds.push(24);
        ds.push(25);
        ds.push(21);
        ds.push(22);
        ds.push(23);
        ds.push(24);
        ds.push(25);
        ds.push(21);
        ds.push(22);
        ds.push(23);
        ds.push(24);
        ds.push(25);
        ds.push(21);
        ds.push(22);
        ds.push(23);
        ds.push(24);
        ds.push(25);

        while(!ds.isEmpty()){
            int val = ds.pop();
            System.out.println(val);
        }
    }
}
