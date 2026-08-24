package Tree;

public class AVLTree {

    public AVLTree(){
    }

    static class Node {
        private int val;
        private int height;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    private Node root;

    public int height(){
        return height(this.root) ;
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int val){
        root = insert(val, root);
    }

    private Node insert(int val, Node node){

        if(node == null){
            node = new Node(val);
            return node ;
        }

        if(val < node.val){
            node.left = insert(val, node.left);
        }
        if (val > node.val){
            node.right = insert(val, node.right);
        }

        node.height = Math.max( height(node.right), height(node.left)) + 1;

        return Rotate(node) ;

    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){

        if(node == null){
            return true   ;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);

    }

    public void display() {
        display(this.root, "Root Node");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getVal());

        display(node.left, "left child of" + node.getVal() + ":");
        display(node.right, "right child of" + node.getVal() + ":");
    }

    public void populate(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }
    private  void populateSorted(int[] nums, int start , int end){

        if(start >= end ){
            return ;
        }

        int mid = (start + end )/ 2 ;

        this.insert(nums[mid]);

        populateSorted(nums, start , mid);
        populateSorted(nums, mid + 1, end);

    }

    private Node Rotate(Node node){

        if( node == null){
            return node ;
        }

        if(height(node.left) - height(node.right) > 1){
            // left heavy
            if(height(node.left.left) - height(node.left.right ) > 0){
                //left-left case
                return rightRotate(node) ;
            }
            if(height(node.left.left) - height(node.left.right ) < 0) {
                //left-right  case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < -1){
            //right heavy
            if(height(node.right.left) - height(node.right.right ) < 0){
                //right-right case
                return leftRotate(node) ;
            }
            if(height(node.right.left) - height(node.right.right ) > 0) {
                //right-left  case
                node.right = rightRotate(node.left);
                return leftRotate(node);
            }
        }
        return node ;
    }

    private Node leftRotate(Node parent){
        Node child = parent.right ;
        Node t = child.left ;

        child.left = parent ;
        parent.right = t ;

        parent.height = Math.max(height(parent.left), height(parent.right) + 1)  ;
        child.height = Math.max(height(child.left), height(child.right) + 1) ;

        return child ;

    }

    private Node rightRotate(Node parent){
        Node child = parent.left ;
        Node t = child.right ;

        child.right = parent ;
        parent.left = t ;

        parent.height = Math.max(height(parent.left), height(parent.right) + 1) ;
        child.height = Math.max(height(child.left), height(child.right) + 1);

        return child ;
    }

    public static void main() {

        AVLTree tree = new AVLTree() ;

        for(int i = 0 ; i < 1000 ; i++){
            tree.insert(i);
        }

        System.out.println(tree.height());
    }
}
