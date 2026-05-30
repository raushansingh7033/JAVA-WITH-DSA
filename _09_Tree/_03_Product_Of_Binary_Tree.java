class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class _03_Product_Of_Binary_Tree {
    static int prodOfBinaryTree(Node root){
        if(root==null)return 1;
        return root.data*prodOfBinaryTree(root.left)*prodOfBinaryTree(root.right);
    }
    public static void main(String[] args) {
          Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int prod=prodOfBinaryTree(root);
        System.out.println("Product of binary tree is "+prod);
    }
}
