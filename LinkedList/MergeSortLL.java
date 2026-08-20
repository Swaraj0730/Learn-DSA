package LinkedList;

public class MergeSortLL {

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

    public static Node getMid(Node head){

        Node midprev = null ;

        while( head != null && head.next != null ){
            midprev = (midprev == null) ? head:midprev.next ;
            head = head.next.next ;
        }
        Node mid = midprev.next ;
        midprev = null ;
        return mid ;
    }

    public static Node merge(Node l1, Node l2){

        Node dummy = new Node() ;
        Node tail = dummy ;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1 ;
                l1 = l1.next ;
                tail = tail.next ;
            }else{
                tail.next = l2 ;
                l2 = l2.next ;
                tail = tail.next ;
            }
        }
        tail.next = (l1 != null) ? l1 : l2 ;
        return dummy ;
    }

    public static Node mergeSort(Node head){

        if(head == null || head.next == null ){
            return head ;
        }
        Node mid = getMid(head);
        Node left = mergeSort(head);
        Node right = mergeSort(mid);

        return merge(left, right);
    }

    public static void main(String[] args) {

        MergeSortLL ll = new MergeSortLL() ;

        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(1);
        
        ll.printList();
        
        ll.mergeSort(head);
        
    }
    
}
