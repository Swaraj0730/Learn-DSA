package Tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){
    }

    private Node root ;
    static class Node {
        int val ;
        Node right ;
        Node left ;

        public Node(int val){
            this.val = val ;
            this.right = null ;
            this.left = null ;
        }
    }

    // insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root node");
        int value = scanner.nextInt() ;
        root = new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " + node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left of" + node.val);
            int value = scanner.nextInt();
            node.left = new Node(value) ;
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of right of" + node.val);
            int value = scanner.nextInt();
            node.right = new Node(value) ;
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root , " ");
    }

    private void display(Node node, String indent){

        if(node == null){
            return ;
        }
        System.out.println(indent + node.val);
        display(node.left , indent + "\t");
        display(node.right , indent + "\t");

    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();

    }
}
