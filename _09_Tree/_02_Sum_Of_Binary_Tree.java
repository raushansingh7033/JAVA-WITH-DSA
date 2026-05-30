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
public class _02_Sum_Of_Binary_Tree {
    static int sumOfBinaryTree(Node root){
        if(root==null)return 0;
         return root.data+sumOfBinaryTree(root.left)+sumOfBinaryTree(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int sum=sumOfBinaryTree(root);
        System.out.println("Sum of binary Tree is "+sum);
    }
}
