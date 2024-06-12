package Practice.dataStructure;

public class BinarySearchTree {
    Node root;


    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BinarySearchTree(int val) {
        root = new Node(val);
    }

    public void insert(int val) {
        insert(root, val);
    }

    public Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else
            root.right = insert(root.right, val);

        return root;
    }

    void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public Node search(Node root, int val) {
        if (root == null || root.data == val)
            return root;
        if (val < root.data)
            return search(root.left, val);

        return search(root.right, val);
    }
    public void delete(int val){
        delete(root, val);
    }
    public Node delete(Node root, int val) {
        if (root == null)
            return root;
        if (val < root.data)
            root.left = delete(root.left, val);
        else if (val > root.data)
            root.right = delete(root.right, val);
        else{
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;

            root.data=min(root.right);
            root.right=delete(root.right, root.data);
        }
        return root;
    }
    private int min(Node root){
        int minVal=root.data;
        while(root.left!=null){
            minVal=root.left.data;
            root=root.left;
        }
        return minVal;
    }
}
