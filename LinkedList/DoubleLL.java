package LinkedList;


public class DoubleLL {

    static Node head ;

    static class Node{

        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void addFirst(int data){

        Node newNode = new Node(data);

        if( head == null ){
            head = newNode;
            return ;
        }

        newNode.next = head ;
        head.prev = newNode ;
        head = newNode ;
    }

    public static void addLast(int data){

        Node newNode = new Node(data);

        if( head == null ){
            head = newNode; 
            return ;
        }

        Node temp = head ;

        while( temp.next != null ){
            temp = temp.next ;
        }

        temp.next = newNode ;
        newNode.prev = temp ;
    }

    public static int  removeKth(int k , int size){

        if( k > size ){
            return -1 ;
        }

        Node temp = head ;
        int pointer = 0 ;
        while( pointer < k ){
            temp = temp.next ;
            pointer++ ; 
        }
        int data = temp.data ;

        temp.prev.next = temp.next ;
        temp.next.prev = temp.prev ;

        return data ;
    }

    public static void insertKth(int data, int k , int size){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode ;
            return ;
        }

        if( k > size){
            System.out.println("not possible");
            return ;
        }

        Node temp = head ;
        int pointer = 0 ;
        while( pointer < k ){
            temp = temp.next ;
            pointer++;
        }

        newNode.next = temp ;
        temp.prev.next = newNode ;
        temp.prev = newNode ;
        newNode.prev = temp.prev ;
    }

    public static int size(){

        if(head == null){
            return 0;
        }
        int count = 0;
        Node temp = head ;
        while(temp != null){
            temp = temp.next ;
            count = count + 1;
        }
        return count ; 
    }

    public static void print(){

        if(head == null){
            System.out.println("empty");
            return ;
        }

        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        DoubleLL dll = new DoubleLL() ;

        // dll.addFirst(1);
        // dll.addFirst(2);
        // dll.addFirst(3);
        // dll.addFirst(4);
        
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        



        dll.print();

        //System.out.println(dll.removeKth(2, dll.size()));

        dll.insertKth(67, 1, dll.size());

        dll.print();

        
    }
    
}
