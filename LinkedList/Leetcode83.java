package LinkedList;

public class Leetcode83 {

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

    public static Node deleteDuplicates(Node node) {

        if(node == null){
            return node ;
        }

        Node temp = node ;

        while(temp.next != null ){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next ;
            }
            else{
                temp = temp.next ;
            }
        }
        return temp ;
    }

    public static Node join(Node l1, Node l2){

        if(l1 == null ){
            return l2;
        }

        if(l2 == null){
            return l1 ;
        }
        
        Node list = new Node(0);
        Node temp1 = l1 ;
        Node temp2 = l2 ;
        while( temp1.next != null || temp2.next != null ){
            if( temp1.val > temp2.val) {
                list.next = temp1 ;
            }else{
                list.next = temp2 ;
            }
        }
        return list ;
    }

    public static void main(String[] args) {

        Leetcode83 ll = new Leetcode83();
        Leetcode83 ll2 = new Leetcode83();

        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(2);

        ll.printList();

        ll2.addLast(1);
        ll2.addLast(1);
        ll2.addLast(2);

        ll2.printList();
    

        
    }
    
}
