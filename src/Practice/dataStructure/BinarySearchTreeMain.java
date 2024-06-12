package Practice.dataStructure;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree bt=new BinarySearchTree(50);
        bt.insert(70);
        bt.insert(60);
        bt.insert(30);
        bt.insert(10);
        bt.insert(80);
        System.out.println("Inorder traverse");
        bt.inOrder(bt.root);
        bt.delete(70);
        System.out.println("Inorder traverse");
        bt.inOrder(bt.root);
        System.out.println("\nPostorder traverse");
        bt.postOrder(bt.root);
        System.out.println("\nPreorder traverse");
        bt.preOrder(bt.root);

        //search
        if(bt.search(bt.root, 15)==null){
            System.out.println("not found");
        }else
            System.out.println("found");
    }
}
