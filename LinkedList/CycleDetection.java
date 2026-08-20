package LinkedList;

public class CycleDetection {

    static Node head;

    static class Node {

        private int val ;
        private Node next ;

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

    public static int  length( Node head){

        Node slow = head ;
        Node fast = head ;
        int length = 0 ;

        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next ;

            if(fast == slow){
                Node temp = slow;
                do{
                    temp = temp.next;
                    length++ ;
                }while(temp != slow);
            }
            return length;
        }
        return 0 ;
    } 

    public static Node findCycleNode(Node head){

        Node slow = head ;
        Node fast = head ;
        int length = 0 ;

        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next ;

            if(fast == slow){
                length  = length(slow);
                break ;
            }
        }

        if( length == 0){
            return null ;
        }

        Node f = head ;
        Node s = head ;

        while( length > 0 ){
            s = s.next ;
            length-- ;
        }

        while( f!= s){
            f = f.next ; 
            s = s.next ;
        }

        return f ;
    }

    public static void main(String[] args) {
        
    }
    
}
