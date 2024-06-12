package Practice.dataStructure;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BT{
    Node root;
    BT(){
        root=null;
    }

    public Node insert(Node root, int val){
        if(root==null){
            return new Node(val);
        }
        if(val<root.data){
            root.left=insert(root.left, val);
        }else
            root.right=insert(root.right, val);

        return root;
    }
    void preOrder(Node node){
         if(node==null)
             return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    void inOrder(Node node){
        if(node==null)
            return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    void postOrder(Node node){
        if(node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        BT obj=new BT();
        obj.root=new Node(1);
        obj.root.left=new Node(2);
        obj.root.right=new Node(3);
        obj.root.left.left=new Node(4);
        obj.root.left.right=new Node(5);
        System.out.print("inorder ==> ");
        obj.inOrder(obj.root);
        System.out.println();
        System.out.print("preorder ==> ");
        obj.preOrder(obj.root);
        System.out.println();
        System.out.print("postorder ==> ");
        obj.postOrder(obj.root);
        System.out.println();
    }

}
