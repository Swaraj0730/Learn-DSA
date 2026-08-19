package LinkedList;

public class CircularLL {

    static Node head;
    static Node tail;

    static class Node {

        private int val ;
        private Node next ;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void addFirst(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            newNode.next = head ;
           return ;
        }

        Node temp = head ;

        while(temp.next != head ){
            temp = temp.next ;
        }

        temp.next = newNode ;
        newNode.next = head ; 
        head = newNode ;
    }

    public static void addLast(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            newNode.next = head ;
            return ;
        }

        Node temp = head ;

        while(temp.next != head){
            temp = temp.next ;
        } 

        temp.next = newNode;
        newNode.next = head ;
    }

    public static void printList(){

        if(head == null){
            System.out.println("empty");
            return ;
        }

        Node temp = head ;

        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while(temp != head);

        System.out.println("HEAD");
    }

    public static void removeFirst(){

        if(head == null){
            System.out.println("empty");
            return ;
        }

        Node temp = head ;

        while(temp.next != head){
            temp = temp.next ;
        }

        head = head.next ;
        temp.next = head ;
    }

    public static void removeLast(){

        if(head == null){
            System.out.println("empty");
            return ;
        }

        Node temp = head ;
        while(temp.next.next != head){
            temp = temp.next;           
        }

        temp.next = head ;
    }


    public static int size(){
        int count = 0 ;

        if(head == null){
            return 0 ;
        }
        Node temp = head ;

        do {
            count++;
            temp = temp.next;
        } while(temp != head);

        return count;   
    }

    public static void insertKth(int num, int k , int size){

        Node node  = new Node(num);

        if( k > size){
            System.out.println("not possible");
            return ;
        }

        Node temp = head ;
        int pointer = 0;
        while(pointer < k ){
            temp = temp.next ;
            pointer++;
        }

        if( k == size - 1) {
            temp.next = node ;
            node.next = head ;
        }
         
        node.next = temp.next ;
        temp.next = node ;
    }

    public static void deleteKth( int k , int size){

        if( k > size){
            System.out.println("not possible");
            return ;
        }

        Node temp = head ;
        int pointer = 0;
        while(pointer < k - 1 ){
            temp = temp.next ;
            pointer++;
        }

        if( k == size - 1) {
            temp.next = head ;
        }

        temp.next = temp.next.next ;
    }

   


    public static void main(String[] args) {

        CircularLL  list = new CircularLL() ;

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printList();
        
    }

}

