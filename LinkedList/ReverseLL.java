package LinkedList;

public class ReverseLL {

    static Node head;

    static class Node {

        private int val ;
        private Node next ;

        public Node(){
        }

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
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


    public static void Reverse(){
        if(head == null || head.next == null){
            return ;
        }

        Node prev = head ;
        Node curr = head.next ;

        while( curr != null){
            Node next = curr.next ;
            curr.next = prev ;

            //update

            prev = curr ;
            curr = next ;
        }
        head.next = null ;
        head = prev ;
    }

    public static Node ReverseLL2(Node head, int left , int right ){

        if( left == right ){
            return head ;
        }

        Node curr = head ;
        Node prev = null ;

        for(int i = 0 ; curr != null && i < left - 1 ; i++){
            prev = curr ;
            curr = curr.next ;
        }

        Node last = prev ;
        Node newEnd = curr ;

        // reverse between left and right 

        Node next = curr.next ;
        for(int i = 0 ; curr != null && i < right - left + 1 ; i++){
            curr.next = prev ;
            prev = curr ;
            curr = next ;
            if(next != null){
                next = next.next ;
            }

        }

        if(last != null){
            last.next = prev ;
        }else{
            head = prev ;
        }

        newEnd.next = curr ;

        return head ;      
    }

    public Node rotateRight(Node head, int k) {

        if( k < 0 || head == null){
            return head ;
        }

        while (k > 0){
            Node temp = head ;
            while( temp.next != null ){
                temp = temp.next ;
            }
            Node carry = temp ;
            temp.next = head ;
            head = temp ;

            k-- ;
        }
        return head ;
    }

    public static void main(String[] args) {

        ReverseLL bl = new ReverseLL() ;

        bl.addLast(1);
        bl.addLast(2);
        bl.addLast(3);
        bl.addLast(4);
        bl.addLast(5);

        bl.printList();

        bl.rotateRight(head, 3) ;

        bl.printList();

    }
    
}
