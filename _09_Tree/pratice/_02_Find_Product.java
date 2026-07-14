class TreeNode{
    int num;
    TreeNode left;
    TreeNode right;
    TreeNode(int num){
        this.num=num;
    }
}
public class _02_Find_Product {
   public static void main(String[] args) {
            TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.left=new TreeNode(70);
        root.right.right=new TreeNode(60);
        System.out.println(product(root));
   } 
   public static long product(TreeNode root){
    if(root==null) return 1;
    return (long) root.num*product(root.left)*product(root.right);
   }
}
