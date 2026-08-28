package Tree;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.*;

public class BFS {

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

    public BFS() {
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

    public List<List<Integer>> Bfs(){
        return Bfs(this.root);
    }

    private List<List<Integer>> Bfs(Node node){

        List<List<Integer>> result = new ArrayList<>();

        if(node == null){
            return result ;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(node);

        while(!q.isEmpty()){
            int levelSize = q.size() ;
            List<Integer> currlevel = new ArrayList<>(levelSize) ;
            for(int i = 0 ; i < levelSize ; i++){
                Node currNode = q.poll() ;
                currlevel.add(currNode.val) ;

                if(currNode.left != null ) {
                    q.offer(currNode.left);
                }
                if(currNode.right != null ){
                    q.offer(currNode.right);
                }
            }
            result.add(currlevel);
        }
        return result;
    }


    public void bfs(){
        bfs(this.root);
    }

    private void bfs(Node node){

        if(root == null){
            return ;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(node);

        while (!q.isEmpty()){
            Node currNode = q.poll();
            System.out.print(currNode.val + " ");

            if(currNode.left != null){
                q.offer(currNode.left);
            }
            if(currNode.right != null){
                q.offer(currNode.right);
            }
        }
    }

    public Node levelOrderSuccessor(int k){
        return levelOrderSuccessor(root, k);
    }

    private Node levelOrderSuccessor(Node node, int k){
        if(node == null){
            return null ;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(node);

        while(!q.isEmpty()){
            int levelSize = q.size();
            Node currNode = q.poll() ;

            if(currNode.left != null){
                q.offer(currNode.left);
            }

            if(currNode.right != null){
                q.offer(currNode.right);
            }

            if( currNode.val == k){
                break ;
            }
        }

        return q.peek() ;
    }

    public  List<List<Integer>> bfsZigZag() {
        return bfsZigZag(this.root);
    }

    private  List<List<Integer>> bfsZigZag(Node node){

        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result ;
        }

        Deque<Node> q = new LinkedList<>();
        boolean flag = false ;
        q.offer(node);

        while (!q.isEmpty()){
            int size = q.size() ;
            List<Integer> levelList = new ArrayList<>(size);

            for(int i = 0 ; i < size ; i++){
                if(!flag) {
                    Node currNode = q.pollFirst() ;
                    levelList.add(currNode.val);
                    if (currNode.left != null) {
                        q.addLast(currNode.right);
                    }

                    if (currNode.right != null) {
                        q.addLast(currNode.left);
                    }
                }

                else {
                    Node currNode = q.pollLast() ;
                    levelList.add(currNode.val);

                    if (currNode.right != null) {
                        q.addFirst(currNode.right);
                    }

                    if (currNode.left != null) {
                        q.addFirst(currNode.left);
                    }
                }
                flag = !flag ;
            }
            result.add(levelList);
        }
        return result ;
    }

    public Node findNode(int k){
        return findNode(this.root, k);
    }

    private  Node findNode(Node node, int k){

        if(node == null ){
            return null ;
        }

        if(node.val == k){
            return root ;
        }

        Node left = findNode(node.left, k);
        if( left != null){
            return left ;
        }
       return  findNode(node.right, k);

    }

    public static void main(String[] args){

         BFS bfs = new BFS() ;

        int[] nums = {3,9,20,15,7};
        bfs.populate(nums);



        System.out.println(bfs.findNode(9));



    }
}
