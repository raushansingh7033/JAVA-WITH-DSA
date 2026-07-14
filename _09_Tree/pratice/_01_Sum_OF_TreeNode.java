class TreeNode{
    int num;
    TreeNode left;
    TreeNode right;
    TreeNode(int num){
        this.num=num;
    }
}
public class _01_Sum_OF_TreeNode {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.left=new TreeNode(70);
        root.right.right=new TreeNode(60);
        System.out.println(sum(root));
    }
    public static int sum(TreeNode root){
        if(root==null)return 0;
       return root.num+sum(root.left)+sum(root.right);
    }
}
