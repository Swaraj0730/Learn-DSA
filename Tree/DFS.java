package Tree;

public class DFS {

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

    public DFS() {
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

    public void populate(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
            this.insert(nums[i]);
        }
    }
    public void dfs(){
        dfs(this.root);
    }

    private void dfs(Node node){

    }

    public static void main(String[] args){

    }
}
