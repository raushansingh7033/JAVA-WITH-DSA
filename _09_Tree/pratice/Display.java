class TreeNode{
    int num;
    TreeNode left;
    TreeNode right;
    TreeNode(int num){
        this.num=num;
    }
}
public class Display {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.left=new TreeNode(70);
        root.right.right=new TreeNode(60);
        display(root);
    }
    public static void display(TreeNode root){
        if(root==null)return;
        System.out.println(root.num);
        display(root.left);
        display(root.right);
    }
}
