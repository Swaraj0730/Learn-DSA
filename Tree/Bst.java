package Tree;

public class Bst {

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

    public Bst() {
    }

    public int height(Node node) {
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

       node.height = Math.max( height(node.right), height(node.left)) ;

       return node ;

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

    static void main() {

        int[] nums = {3, 5, 6, 7, 2, 5, 8};
        Bst tree = new Bst() ;

        tree.populate(nums);
        tree.display();

    }
}
