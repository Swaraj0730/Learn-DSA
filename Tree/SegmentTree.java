package Tree;

public class SegmentTree {

    static class Node {
        int val ;
        int start ;
        int end ;
        Node left ;
        Node right ;

        public Node(int start, int end){
            this.start = start ;
            this.end = end ;
            this.left = null;
            this.right = null ;
        }
    }

    Node root ;

    public SegmentTree(int[] arr){
        this.root = constructTree(arr, 0, arr.length-1);
    }

    public Node constructTree(int[] arr, int start, int end){

        if (start ==  end){
            //leaf node
            Node leaf = new Node(start, end);
            leaf.val = arr[start];
            return leaf ;
        }

        // create new node with index you are at
        Node node = new Node(start, end);
        int mid = (start + end)/2 ;

        node.left = constructTree( arr, start , mid);
        node.right = constructTree( arr,mid + 1 , end) ;

        node.val = node.left.val + node.right.val ;
        return node ;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        String str = " ";

        if(node.left != null ){
            str = str + "Interval = [ " + node.left.start + "-" + node.left.end + " ] " + node.left.val + " +-->" ;
        }
        else {
            str = str + "no left child";
        }

        // for current data
        str = str + " Interval = [ " + node.start + "-" + node.end + " ] data : " + node.val  ;

        if(node.right != null ){
            str = str + " + <--+ Interval = [ " + node.right.start + "-" + node.right.end + " ] " + node.right.val ;
        }
        else {
            str = str + "no right child";
        }
        System.out.println(str);

        //call recursion
        if(node.left != null){
            display(node.left);
        }

        if(node.right != null){
            display(node.right);
        }
    }

    public int query(int qstart , int qend){
        return query(this.root, qstart , qend);
    }

    private int query(Node node, int qstart, int qend){

        if(node.start >= qstart && node.end <= qend){
            // node lies under the query range
            return node.val ;
        }
        else if ( node.start > qend || node.end < qstart){
            // completely out of range
            return 0 ;
        }
        else{
            return query(node.left, qstart , qend)  + query(node.right, qstart, qend) ;
        }
    }

    //update
    public void update(int index, int value){
        this.root.val = update(root, index, value);
    }
    private int update(Node node , int index, int value){

        if(index >= node.start && index <= node.end){
            if(index == node.start && index == node.end ) {
                node.val = value;
                return node.val ;
            }
            int leftans = update(node.left , index, value);
            int rightans = update(node.right, index, value);

            node.val = leftans + rightans ;
            return node.val ;
        }
        return node.val ;
    }

    public static void main(String[] args){

        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr) ;
        tree.display();

        System.out.println(tree.query(1, 6));

    }
}
