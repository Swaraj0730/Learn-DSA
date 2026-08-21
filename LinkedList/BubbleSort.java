package LinkedList;

public class BubbleSort {

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


    public Node bubbleSort(Node head) {

    if (head == null || head.next == null) {
        return head;
    }

    boolean swapped;

    do {
        swapped = false;

        Node temp = head;

        while (temp.next != null) {

            if (temp.val > temp.next.val) {

                int value = temp.val;
                temp.val = temp.next.val;
                temp.next.val = value;

                swapped = true;
            }

            temp = temp.next;
        }

    } while (swapped);

    return head;
}

    public static void main(String[] args) {


        BubbleSort bl = new BubbleSort() ;

        bl.addLast(5);
        bl.addLast(4);
        bl.addLast(6);
        bl.addLast(7);
        bl.addLast(1);

        bl.bubbleSort(head);
        
        bl.printList();
        
    }
    
}
