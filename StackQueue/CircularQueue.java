package StackQueue;

public class CircularQueue {

    public static final int DEFAULT_SIZE = 10 ;
    protected int[] data ;

    protected int end = 0 ;
    protected int front = 0 ;
    private int size = 0 ;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int defaultSize) {
        this.data = new int[DEFAULT_SIZE] ;
    }

    public boolean isFull(){

        return size == data.length ;
    }

    public boolean isEmpty(){

        return size == 0 ;
    }

    public boolean insert(int val){
        if(isFull()){
            return false ;
        }
        data[end++] = val ;
        end = end % data.length ;
        size++ ;
        return  true ;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("empty queue");
        }
        int removed = data[front++];
        front = front% data.length ;
        size-- ;
        return removed ;
    }

    public int front() throws Exception{

        if(isEmpty()){
            throw new Exception(" Empty queue");
        }
        return data[front] ;

    }

    public void display(){
       if(isEmpty()){
           System.out.println("Empty");
           return ;
       }
       int i = front ;
       do{
           System.out.print(data[i] + " ");
           i++ ;
           i %= data.length;
       }while ( i != end);
        System.out.println();
    }

}
