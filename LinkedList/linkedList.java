package LinkedList;

public class linkedList {

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

        Node newnNode = new Node(data);

        if(head == null){
            head = newnNode;
           return ;
        }

        newnNode.next = head ;
        head = newnNode ;
    }

    public static void addLast(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return ;
        }

        Node temp = head ;

        while(temp.next != null){
            temp = temp.next ;
        }

        temp.next = newNode;
    }

    public static void printList(){

        if(head == null){
            System.out.println("empty");
            return ;
        }

        Node temp = head ;

        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next ;
        }
        System.out.println("Null");
    }

    public static void removeFirst(){

        if(head == null){
            System.out.println("empty");
            return ;
        }

        Node node = head ;
        head = head.next ;
    }

    public static void removeLast(){

        if(head == null){
            System.out.println("empty");
            return ;
        }

        Node temp = head ;
        while(temp.next.next != null){
            temp = temp.next;           
        }

        temp.next = null ;
    }


    public static int size(){
        int count = 0 ;

        if(head == null){
            return 0 ;
        }
        Node temp = head ;
        while(temp != null){
            temp = temp.next ;
            count = count + 1;
        }
        return count ;
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
        while(pointer < k - 1){
            temp = temp.next ;
            pointer++;
        }

        temp.next = temp.next.next ;
    }


    public static void main(String[] args) {

        linkedList list = new linkedList() ;

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printList();

        int size = list.size();
       
        list.deleteKth(3, size);

        list.printList();

        
    }

}

