//demo binary tree

public class BinaryTree {
    Node root;

    public BinaryTree(){
        root = null;
    }

    public void buildTree(){
        this.root = new Node(1);
        this.root.left = new Node(2);
        this.root.right = new Node(3);
        this.root.left.left = new Node(4);
        this.root.left.right = new Node(5);
        this.root.right.right = new Node(6);
    }
    
    public void printPreOrderWrapper(){
        printPreOrder(root);
        System.out.println();
    }
    public void printPreOrder(Node root){
        if (root != null){
            System.out.print (root.data + " ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    public void printInOrderWrapper(){
        printInOrder(root);
        System.out.println();
    }
    public void printInOrder(Node root){
        if (root != null){
            printInOrder(root.left);
            System.out.print (root.data + " ");
            printInOrder(root.right);
        }
    }

    public void printPostOrderWrapper(){
        printPostOrder(root);
        System.out.println();
    }
    public void printPostOrder(Node root){
        if (root != null){
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print (root.data + " ");
        }
    }
}